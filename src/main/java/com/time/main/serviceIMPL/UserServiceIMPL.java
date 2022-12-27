package com.time.main.serviceIMPL;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.main.entity.Softwares;
import com.time.main.entity.User;
import com.time.main.repository.User_Repository;
import com.time.main.serviceDAO.UserServiceDAO;

@Service
public class UserServiceIMPL implements UserServiceDAO {

	@Autowired
	User_Repository repo;

	LocalDateTime d1 = LocalDateTime.now();
	LocalDateTime d2 = LocalDateTime.now();

	DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");

	// for getting all the user information
	@Override
	public List<User> getAll() {
		return repo.find();

	}

	// setting the time for all
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public User save(User user) {
		Softwares soft = new Softwares();
		
		System.out.println("get name 11= "+user.getApps().get(0).getSoftwareName());
		
		List<Softwares> name = user.getApps();
	
		System.out.println("get software name = "+name);
		
		System.out.println("get name = "+user.getApps().get(0).getSoftwareName());
	
		System.out.println("get name == "+ name.get(0).getSoftwareName());
		
		if(user.getApps().get(0).getSoftwareName() ==  name.get(0).getSoftwareName()) {
			System.out.println("if 1 block");
//			soft.setSoftwareName(soft.getSoftwareName());
			System.out.println("idf 2 block");
		}
		else {
			System.out.println("else block");
			soft.setSoftwareName(soft.getSoftwareName());
		}

		user.setStartTime(d1);

		return repo.save(user);
	}

	// setting the time using put so we can have logout time
	public User update(User user, int id) {

		User existuser = repo.getuserbyid(id);

		existuser.setEndTime(d2);
	
		// setting the duration by subtracting the start and end time
		LocalDateTime start = existuser.getStartTime();
		LocalDateTime end = existuser.getEndTime();
		

		long difftime = ChronoUnit.NANOS.between(start, end);

		Duration dur = Duration.ofNanos(difftime);

		long seconds = dur.getSeconds();
		long HH = seconds / 3600;
		long MM = (seconds % 3600) / 60;
		long SS = seconds % 60;

		String time = String.format("%02d:%02d:%02d", HH, MM, SS);

		existuser.setDuration(time);

		return repo.update(existuser);

	}

}
