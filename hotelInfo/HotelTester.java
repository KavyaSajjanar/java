package com.xworkz.hotelInfo;

import com.xworkz.hotelInfo.constants.Location;
import com.xworkz.hotelInfo.hotel.HotelsDTO;
import com.xworkz.hotelInfo.hotel.HotelsInCity;

public class HotelTester {


		public static void main(String[] args) {
			String[] foodItems = new String[10];
			foodItems[0] = "Idli";
			foodItems[1] = "Biriyani";
			foodItems[2] = "Dosa";
			foodItems[3] = "Puliyogare";
			foodItems[4] = "Fried Rice";
			foodItems[5] = "Palak Panir";
			foodItems[6] = "Parota";
			foodItems[7] = "Chicken Biriyani";
			foodItems[8] = "Mudde huli";
			foodItems[9] = "Benne Dosa";

			HotelsInCity hotel = new HotelsInCity(5);

			HotelsDTO dto = new HotelsDTO("Ayodya", Location.KORMANGALA, foodItems);
			hotel.addHotel(dto);
			hotel.displayHotelInfo();

			
			HotelsDTO dto2=new HotelsDTO("Udupi", Location.KRPURAM, foodItems);
			hotel.addHotel(dto2);
			hotel.displayHotelInfo();
			
			HotelsDTO dto3=new HotelsDTO("Brundavana", Location.MYSORE, foodItems);
			hotel.addHotel(dto3);
			hotel.displayHotelInfo();

			hotel.displayByName("Ayodya", Location.KORMANGALA);
			
			hotel.displayByName("Brundavana", Location.MYSORE);
			
			
			

		}

	
	}


