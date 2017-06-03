package group9.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Cart {

	public static List<Sanpham> list = null;
	
	public static void addCart(Sanpham sp)
	{
		if(list== null) list = new ArrayList<Sanpham>();
		list.add(sp);
	}
	
	public static boolean deleteProduct(Sanpham sp)
	{
		for(Iterator<Sanpham> i = list.iterator(); i.hasNext();)
		{
			Sanpham temp = i.next();
			if(temp.getM_idC() == sp.getM_idC())
			{
				return list.remove(temp);
			}
		}
		return false;
	}
	
	public static boolean deleteProduct(String idsp)
	{
		for(Iterator<Sanpham> i = list.iterator(); i.hasNext();)
		{
			Sanpham temp = i.next();
			if(idsp.equals(temp.getM_idC()))
			{
				return list.remove(temp);
			}
		}
		return false;
	}
	public static void removeall()
	{
		list.clear();
		list = null;
	}
	public static int quantityCart()
	{
		return list.size()+1;
	}
	
	
	
}
