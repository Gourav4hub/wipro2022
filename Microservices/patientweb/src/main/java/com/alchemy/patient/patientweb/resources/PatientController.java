package com.alchemy.patient.patientweb.resources;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.alchemy.patient.patientweb.model.Patient;
import com.alchemy.patient.patientweb.model.PatientVisit;
import com.alchemy.patient.patientweb.repository.PatientRepository;
import com.alchemy.patient.patientweb.response.ImageResponseData;
import com.alchemy.patient.patientweb.response.VisitResponse;
import com.alchemy.patient.patientweb.service.PatientService;

@RestController
@CrossOrigin
@RequestMapping("/patient")
public class PatientController
{
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private RestTemplate template;
	
	@PostMapping("/getImage")
	public ResponseEntity getImage(@RequestParam String imagePath) 
	{
		try {
		File file = new File(imagePath);

     	FileInputStream fis = new FileInputStream(file);            
        int size = fis.available();
        byte arr[] = new byte[size];
        
        fis.read(arr);
        fis.close();
        byte[] encoded = Base64.getEncoder().encode(arr);
       
        String fileStr = new String(encoded);
        
        ImageResponseData res = new ImageResponseData();
        res.setImageBase64(fileStr);
        res.setStatus(true);
        return ResponseEntity.ok(res);
		}catch(Exception ex) {
			ImageResponseData res = new ImageResponseData();	        
	        res.setStatus(false);
	        return ResponseEntity.ok(res);
		}
	}
	
	@PostMapping("/uploadImage")
	public ResponseEntity uploadPatient(@RequestParam String pid,
			@RequestParam MultipartFile imageFile) 
	{
		String uploadDir = "/home/gaurav/Desktop/Alchemy/uploadPatientImages";
		System.out.println(pid);
		try {
			byte bytes[] = imageFile.getBytes();
			String fileName = imageFile.getOriginalFilename();
			String ext = fileName.substring(fileName.lastIndexOf("."));
			
			fileName = UUID.randomUUID().toString()+ext;
			
//			System.out.println(fileName);
//			System.out.println(bytes.length);
			File file = new File(uploadDir,fileName);
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(bytes);
			fos.close();
			
			Patient patient = patientService.get(pid);
			patient.setPatientImage(file.getAbsolutePath());
			patientService.updatePatient(patient);
			
			ImageResponseData res = new ImageResponseData();
	        res.setImagePath(file.getAbsolutePath());
	        res.setStatus(true);
	        return ResponseEntity.ok(res);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			ImageResponseData res = new ImageResponseData();	        
	        res.setStatus(false);
	        return ResponseEntity.ok(res);
		}
		
	}
	
	@PostMapping("/save")
	public ResponseEntity savePatient(@RequestBody Patient patient) 
	{
		System.out.println(patient);
		Patient newPatient = patientService.savePatient(patient);	
		if(newPatient==null)
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);		
		else
			return ResponseEntity.ok(newPatient);
	}
	
	@PutMapping("/update")
	public ResponseEntity updatePatient(@RequestBody Patient patient) 
	{		
		Patient newPatient = patientService.updatePatient(patient);	
		if(newPatient==null)
			return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);		
		else
			return ResponseEntity.ok(newPatient);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deletePatient(@PathVariable String id) 
	{		
		System.out.println(id);
		Patient patient = patientService.get(id);
		if(patient==null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);		
		else
		{
			boolean result = patientService.deletePatient(patient);
			if(result)
				return new ResponseEntity<>(HttpStatus.OK);	
			else
				return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
		}
	}
	
	@PostMapping("/get/{patientId}")
	public Patient getPatient(@PathVariable String patientId) 
	{
		return patientService.get(patientId);
	}
	
	@GetMapping("/load")
	public ResponseEntity loadPatients() 
	{	
		List<Patient> list = patientService.loadPatients().stream().map((Patient pat)->
		{
			String url = "http://patientvisit/visit/userVisit/"+pat.getPatientId();
			VisitResponse visitResponse = template.postForEntity(url, null,VisitResponse.class).getBody();
			pat.setVisitList(visitResponse.getVisitList());
			return pat;
		}).collect(Collectors.toList());

		return ResponseEntity.ok(list);
	}
}
