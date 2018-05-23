package com.gekko.middleware.derby.hotel;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class RoomMappingSql {
    
    private String maxPax;
    private String derbyCode;
    private String derbyName;
    private String gekkoCode;
    private String info;

    
    public RoomMappingSql(String derbyCode, String derbyName, String info, String maxPax){
        this.derbyCode = derbyCode;
        this.derbyName = derbyName;
        this.gekkoCode = mapGekkoCode(info, maxPax);
        this.maxPax = maxPax;
        this.setInfo(info);
    }

    /**
     * @return the derbyCode
     */
    public String getDerbyCode() {
        return derbyCode;
    }

    /**
     * @return the derbyName
     */
    public String getDerbyName() {
        return derbyName;
    }

    /**
     * @return the gekkoCode
     */
    public String getGekkoCode() {
        return gekkoCode;
    }
    
    /**
     * @return the maxPax
     */
    public String getMaxPax() {
        return maxPax;
    }

    public boolean isNotMapped(){
        return gekkoCode == null;
    }
    
    private String mapGekkoCode(String roomInfo, String maxPax) {
    
        if(StringUtils.isEmpty(maxPax)) return null;// UNKNOWN
        
        // Check max occupancy number
        switch (maxPax) {
            case "1":  return "SING";
            case "2":  { // Check room name/ description
                
                boolean isTwin = match(roomInfo, new String[] {"TWIN", "Twin", "twin"});
                boolean isDouble = match(roomInfo, new String[] {"DOUBLE", "Double", "double"});
                
                if(isTwin && isDouble) return null;// IS BOTH ->  UNKNOWN
                
                if(isTwin) return "TWIN"; // TWIN
                if(isDouble) return "DOUB"; // DOUB
                
                return "DOUB"; // need to be double max pax = 2
            }
            case "3":  return "TRIP";
            case "4":  return "QUAD";
            case "5":  return "QUIN";
            case "6":  return "SEXT";
            case "7":  return "SEPT";
            case "8":  return "OCTU";
            case "9":  return "NONU";
            case "10": return "DECU"; 
            case "12": return "DODE"; 
            case "13": return "PROP"; 
        }
        
        return null;// UNKNOWN
    }
    
    public static boolean match(String inputStr, String[] items) {
        return Arrays.stream(items).parallel().anyMatch(inputStr::contains);
    }

    @Override
    public String toString() {
        return  "PaxNr: " + maxPax + "(@DERBY_GATEWAY_ID, '" + derbyCode + "', '" + derbyName + "', (select idroomtype from roomtypes where roomtypecode='" + gekkoCode + "'))";
      //  return  "(@DERBY_GATEWAY_ID, '" + derbyCode + "', '" + derbyName + "', (select idroomtype from roomtypes where roomtypecode='" + gekkoCode + "'))";
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }
}
