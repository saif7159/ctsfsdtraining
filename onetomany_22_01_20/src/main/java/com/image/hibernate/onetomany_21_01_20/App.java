package com.image.hibernate.onetomany_21_01_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.image.hibernate.dao.AlbumDaoImpl;
import com.image.hibernate.model.Album;
import com.image.hibernate.model.Photo;
import com.image.hibernate.service.Service;
import com.image.hibernate.service.ServiceImpl;

public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Service s = new ServiceImpl();
        do {
        	System.out.println("Enter Choice:\n1. Create an album\n2. View Album\n3. Find by ID\n4. Delete by ID\n5. Update url:\n6. Exit");
        	int choice = Integer.parseInt(br.readLine());
        	switch(choice)
        	{
        		case 1:	System.out.println("Enter album name:");
        		        String abname  = br.readLine();
        		        LocalDate date = LocalDate.now();
        		        System.out.println("Enter the number of photos:");
        		        int num = Integer.parseInt(br.readLine());
        		        Photo[] parray = new Photo[num];
        		        for(int i=0;i<num;i++) {
        		        System.out.println("Enter url:");
        		        String aurl = br.readLine();
        		        parray[i] = new Photo(aurl);
        		 
        		        }
        		        Album a = new Album(abname, date);
        		        s.createAlbum(parray, a);	
        		        break;
        		case 2: List<Album> list = s.getAlbums();
        		 		Iterator i = list.iterator();
        		 		while(i.hasNext())
        		 		{
        		 			System.out.println(i.next());
        		 		}
        			    
        		 		break;
        		case 3: System.out.println("Enter id:");
        		        int id = Integer.parseInt(br.readLine());
        		        System.out.println(s.findById(id));
        		        break;
        		case 4: System.out.println("Enter id:");
		         		int iddel = Integer.parseInt(br.readLine());
		         		s.deleteById(iddel);
		         		break;
        		case 5: System.out.println("Enter url:");
        		        String url = br.readLine();
        		        System.out.println("Enter id:");
        		        int upid = Integer.parseInt(br.readLine());
        		        System.out.println(s.updateUrl(upid, url, LocalDate.now()));
        		        break;
        		case 6: s.systemExit();
        			 	System.exit(0);		
        		 		break;
        		        
        	}
        }while(true);
    }
}
