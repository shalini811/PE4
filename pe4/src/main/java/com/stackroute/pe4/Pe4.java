package com.stackroute.pe4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pe4 {
	
	
	public String checkStr(String s) {
        String [] arr = s.split("");
        String fstr = "";
        String str = "";
        int j = 0;
        int c = 0;
        for(int i = 0;i < arr.length;i++) {
            if(str.contains(arr[i]) && (c <= 2)) {
                str += arr[i].trim();
            }
            else if(!str.contains(arr[i]) && (c < 2)) {
                j = i;
                c++;
                str += arr[i].trim();
            }
            else if(!str.contains(arr[i]) && (c == 2)){
                c = 0;
                i = j-1;
                str = "";
            }
            if(str.length() > fstr.length())
                fstr = str;
        }
        return fstr;
    }
	public int checkChar(String ui) {
	    
         int a=ui.length();
         int b=ui.replace("a", "").length();
         int charcount = a-b;
         return charcount;
    }

	public String doReplace(String sh)
	{
		   //String str = " daily dry";  
		   String rs = sh.replace("d","f"); // Replace 'd' with 'f'    
		   rs = rs.replace("l","t"); // Replace 'i' with 't'  
		 return rs;
		}

		

			
	public String doSort(String xv)
	{
		xv=xv.replaceAll(" ","").toLowerCase();
		char[] str=xv.toCharArray();
		Arrays.sort(str);
		return new String(str);
	}
	public String[] doTraverse(String srr)
	{
		String[] sr=srr.split(" ");
		for(int i=0;i<sr.length;i++)
		{
			StringBuilder sb=new StringBuilder();
			sb.append(sr[i]);
			sb.reverse();
			sr[i]=sb.toString();
		}
		return sr;
	}
	public boolean doCheck(String sc)
	{
		int flag =0;
		String[] sz=sc.split(" ");
		int l=sz.length;
		for(int i=0;i<l;i++)
		{
			if(sz[i].equals("Harry"))
			{
				 flag = 1;
			}
		}
		if(flag == 1)
			return true;
		else
			return false;
	}
	
	public String doCount(String sm,String sj)
	{
		Pattern l=Pattern.compile(sj);
		Matcher k=l.matcher(sm);
		String lp="";
		while(k.find()) {
			lp+= (k.start() + "-" + k.end())+ " ";
		}
		return lp.trim();
		}
	}

