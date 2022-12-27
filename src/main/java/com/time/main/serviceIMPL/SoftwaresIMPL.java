package com.time.main.serviceIMPL;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.main.entity.Softwares;
import com.time.main.entity.User;
import com.time.main.repository.SoftwareRepository;
import com.time.main.serviceDAO.SoftwaresDAO;

@Service
public class SoftwaresIMPL implements SoftwaresDAO {

	@Autowired
	SoftwareRepository softrepo;

	LocalDateTime d1 = LocalDateTime.now();
	LocalDateTime d2 = LocalDateTime.now();

	DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");

	// for getting all the soft information
	@Override
	public List<Softwares> getAll() {
		return softrepo.find();

	}
//	@Override
//	public List<Softwares> getName(String name) {
//		return softrepo.findByName(name);
//
//	}

	
	
	@Override
	public Softwares save(Softwares soft) {

		soft.setStartTime(d1);

		return softrepo.save(soft);
	}

	// setting the time using put so we can have logout time
	public Softwares update(Softwares soft) {

//		User existuser = repo.getuserbyid(id);
//		Softwares soft = new Softwares();
		
		soft.setEndTime(d2);

		// setting the duration by subtracting the start and end time
		LocalDateTime start = soft.getStartTime();
		LocalDateTime end = soft.getEndTime();

		long difftime = ChronoUnit.NANOS.between(start, end);
		
		Duration dur = Duration.ofNanos(difftime);

		long seconds = dur.getSeconds();
		long HH= seconds / 3600;
		long MM= (seconds % 3600) / 60;
		long SS = seconds % 60;
		
	
		
		String time = String.format("%02d:%02d:%02d",HH,MM,SS);
		
		System.out.println(time);
		
		soft.setDuration(time);

		return softrepo.update(soft);

		
		
		
	}

}
