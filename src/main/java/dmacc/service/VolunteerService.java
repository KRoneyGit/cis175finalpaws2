/**
* @author Elizabeth McCurdy - emccurdy
* CIS 175 - Spring 2023
* Apr 5, 2023
* Group 8 Final Project collaboration
* with Sylwia Glod & Kevin Roney
*/
package dmacc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dmacc.beans.Volunteer;
import dmacc.repository.VolunteerRepository;

/**
 * Group 8 Final Project - Pet Adoption Website Service (P.A.W.S.) v2
 * VolunteerService class uses VolunteerRepository
 * 
 */
@Service
public class VolunteerService {
	
	@Autowired
	VolunteerRepository volunteerRepo;
	
	public Volunteer getVolunteerById(long volunteerId) {
		return volunteerRepo.findById(volunteerId).get();
	}
	
	public List<Volunteer> getAllVolunteers(){
		List<Volunteer> volunteers = new ArrayList<Volunteer>();
		volunteerRepo.findAll().forEach(volunteer -> volunteers.add(volunteer));
		return volunteers;
	}
	
	public void saveVolunteerEdit(Volunteer volunteer) {
		volunteerRepo.save(volunteer);
	}
	
	public void deleteVolunteerById(long volunteerId) {
		volunteerRepo.deleteById(volunteerId);
	}
	
	// ?? In future create a method that randomly selects a volunteer so volunteer info can
	// ?? be displayed on volunteer page to be featured as the volunteer of the month. 
	//public Volunteer selectRandomVolunteerById() {
		// determine number of volunteerIds in database volunteers table
		// then use as end range number for Math.random() fxn
		// assign randomly selected number to volunteerId
		//long volunteerId = Math.random
		// then find/return the randomly selected Volunteer entity info
		//return volunteerRepo.findById(volunteerId).get();
	//}
	
}
