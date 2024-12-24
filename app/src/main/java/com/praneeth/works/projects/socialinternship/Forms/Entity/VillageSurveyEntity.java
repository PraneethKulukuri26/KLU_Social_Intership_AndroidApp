package com.praneeth.works.projects.socialinternship.Forms.Entity;

import java.util.ArrayList;

public class VillageSurveyEntity {
    private String Village_ID;

    private BasicInfo Basic_Information;

    private Village_infra Village_Infrastructure_and_Basic_Amenities;

    private Village_Conn Village_Connectivity;

    private sanitation sanitation_system;

    private land_forst Land_forest;

    private villageRequirments Common_Village_Electricity_Requirements;

    private SolidWaste Solid_waste_management;

    private String Comments;

    private WasteTreatment Wastewater_treatment_system;

    private String Village_Survey_date;

    public String getVillage_Survey_date() {
        return Village_Survey_date;
    }

    public void setVillage_Survey_date(String village_Survey_date) {
        Village_Survey_date = village_Survey_date;
    }

    public WasteTreatment getWastewater_treatment_system() {
        return Wastewater_treatment_system;
    }

    public void setWastewater_treatment_system(WasteTreatment wastewater_treatment_system) {
        Wastewater_treatment_system = wastewater_treatment_system;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public SolidWaste getSolid_waste_management() {
        return Solid_waste_management;
    }

    public void setSolid_waste_management(SolidWaste solid_waste_management) {
        Solid_waste_management = solid_waste_management;
    }

    public VillageSurveyEntity(){
        Village_Connectivity=new Village_Conn();
        Land_forest=new land_forst();
        Common_Village_Electricity_Requirements=new villageRequirments();
        Solid_waste_management=new SolidWaste();
    }

    public villageRequirments getCommon_Village_Electricity_Requirements() {
        return Common_Village_Electricity_Requirements;
    }

    public void setCommon_Village_Electricity_Requirements(villageRequirments common_Village_Electricity_Requirements) {
        Common_Village_Electricity_Requirements = common_Village_Electricity_Requirements;
    }

    public land_forst getLand_forest() {
        return Land_forest;
    }

    public void setLand_forest(land_forst land_forest) {
        Land_forest = land_forest;
    }

    public sanitation getSanitation_system() {
        return sanitation_system;
    }

    public void setSanitation_system(sanitation sanitation_system) {
        this.sanitation_system = sanitation_system;
    }

    public String getVillage_ID() {
        return Village_ID;
    }

    public void setVillage_ID(String village_ID) {
        Village_ID = village_ID;
    }

    public BasicInfo getBasic_Information() {
        return Basic_Information;
    }

    public void setBasic_Information(BasicInfo basic_Information) {
        Basic_Information = basic_Information;
    }

    public Village_infra getVillage_Infrastructure_and_Basic_Amenities() {
        return Village_Infrastructure_and_Basic_Amenities;
    }

    public void setVillage_Infrastructure_and_Basic_Amenities(Village_infra village_Infrastructure_and_Basic_Amenities) {
        Village_Infrastructure_and_Basic_Amenities = village_Infrastructure_and_Basic_Amenities;
    }

    public Village_Conn getVillage_Connectivity() {
        return Village_Connectivity;
    }

    public void setVillage_Connectivity(Village_Conn village_Connectivity) {
        Village_Connectivity = village_Connectivity;
    }

    public class BasicInfo{
        private String Name_of_the_village;
        private String Gram_Panchayat;
        private String Number_of_Wards;
        private String Number_of_Hamlets;
        private String Block;
        private String District;
        private String State;
        private String Lok_Sabha_AND_Constituency;
        private String Distance_from_District_HQ;
        private String Area_of_village;
        private String Arable_land_agriculture_Area;
        private String Forest_Area;
        private String Housing_Abadi_Area;
        private String Area_Under_Water_bodies;
        private String Common_Lands_Area;
        private String Average_per_capita_Land_holding;
        private String Waste_land;
        private String Water_Table;
        private String Soil_type;

        public String getName_of_the_village() {
            return Name_of_the_village;
        }

        public void setName_of_the_village(String name_of_the_village) {
            Name_of_the_village = name_of_the_village;
        }

        public String getGram_Panchayat() {
            return Gram_Panchayat;
        }

        public void setGram_Panchayat(String gram_Panchayat) {
            Gram_Panchayat = gram_Panchayat;
        }

        public String getNumber_of_Wards() {
            return Number_of_Wards;
        }

        public void setNumber_of_Wards(String number_of_Wards) {
            Number_of_Wards = number_of_Wards;
        }

        public String getNumber_of_Hamlets() {
            return Number_of_Hamlets;
        }

        public void setNumber_of_Hamlets(String number_of_Hamlets) {
            Number_of_Hamlets = number_of_Hamlets;
        }

        public String getBlock() {
            return Block;
        }

        public void setBlock(String block) {
            Block = block;
        }

        public String getDistrict() {
            return District;
        }

        public void setDistrict(String district) {
            District = district;
        }

        public String getState() {
            return State;
        }

        public void setState(String state) {
            State = state;
        }

        public String getLok_Sabha_AND_Constituency() {
            return Lok_Sabha_AND_Constituency;
        }

        public void setLok_Sabha_AND_Constituency(String lok_Sabha_AND_Constituency) {
            Lok_Sabha_AND_Constituency = lok_Sabha_AND_Constituency;
        }

        public String getDistance_from_District_HQ() {
            return Distance_from_District_HQ;
        }

        public void setDistance_from_District_HQ(String distance_from_District_HQ) {
            Distance_from_District_HQ = distance_from_District_HQ;
        }

        public String getArea_of_village() {
            return Area_of_village;
        }

        public void setArea_of_village(String area_of_village) {
            Area_of_village = area_of_village;
        }

        public String getArable_land_agriculture_Area() {
            return Arable_land_agriculture_Area;
        }

        public void setArable_land_agriculture_Area(String arable_land_agriculture_Area) {
            Arable_land_agriculture_Area = arable_land_agriculture_Area;
        }

        public String getForest_Area() {
            return Forest_Area;
        }

        public void setForest_Area(String forest_Area) {
            Forest_Area = forest_Area;
        }

        public String getHousing_Abadi_Area() {
            return Housing_Abadi_Area;
        }

        public void setHousing_Abadi_Area(String housing_Abadi_Area) {
            Housing_Abadi_Area = housing_Abadi_Area;
        }

        public String getArea_Under_Water_bodies() {
            return Area_Under_Water_bodies;
        }

        public void setArea_Under_Water_bodies(String area_Under_Water_bodies) {
            Area_Under_Water_bodies = area_Under_Water_bodies;
        }

        public String getCommon_Lands_Area() {
            return Common_Lands_Area;
        }

        public void setCommon_Lands_Area(String common_Lands_Area) {
            Common_Lands_Area = common_Lands_Area;
        }

        public String getAverage_per_capita_Land_holding() {
            return Average_per_capita_Land_holding;
        }

        public void setAverage_per_capita_Land_holding(String average_per_capita_Land_holding) {
            Average_per_capita_Land_holding = average_per_capita_Land_holding;
        }

        public String getWaste_land() {
            return Waste_land;
        }

        public void setWaste_land(String waste_land) {
            Waste_land = waste_land;
        }

        public String getWater_Table() {
            return Water_Table;
        }

        public void setWater_Table(String water_Table) {
            Water_Table = water_Table;
        }

        public String getSoil_type() {
            return Soil_type;
        }

        public void setSoil_type(String soil_type) {
            Soil_type = soil_type;
        }
    }

    public class Village_infra{

        private ans Primary_School_Govt;
        private ans Primary_School_Private;
        private ans Middle_School_Govt;
        private ans Middle_School_Private;
        private ans Secondary_School_Private;
        private ans Secondary_School_Govt;
        private ans ITI_Diploma_institutes_Govt;
        private ans ITI_Diploma_institutes_Private;
        private ans College_Govt;
        private ans College_Private;
        private ans Banks_ATM;
        private ans Primary_Health_Centers;
        private ans Civil_Hospital;
        private ans SHG;
        private ans NGO;
        private ans Jan_Aushadhi_Yojana_Kendra;
        private ans Post_Office;
        private ans Gas_agencies;
        private ans Training_Centres_and_specify_which;
        private ans Electricity_Office;
        private ans Anganwadi_Kendra;
        private ans Petrol_Pumps_in_village;
        private ans Kisan_Sewa_Kendra;
        private ans Krishi_Mandi;
        private ans Fare_Price_Shop;
        private ans Milk_Cooperative;
        private ans Railway_Station;
        private ans Bus_Stop;
        private ans Veterinary_Care_Centre;
        private ans Sports_Facility;
        private ans Number_Common_sanitation;


        public class ans{
            private String Located_in_village;
            private String NoS_inside_Village;
            private String Distance_km_if_located_outside;

            public ans(String located_in_village, String noS_inside_Village, String distance_km_if_located_outside) {
                Located_in_village = located_in_village;
                NoS_inside_Village = noS_inside_Village;
                Distance_km_if_located_outside = distance_km_if_located_outside;
            }

            public String getLocated_in_village() {
                return Located_in_village;
            }

            public void setLocated_in_village(String located_in_village) {
                Located_in_village = located_in_village;
            }

            public String getNoS_inside_Village() {
                return NoS_inside_Village;
            }

            public void setNoS_inside_Village(String noS_inside_Village) {
                NoS_inside_Village = noS_inside_Village;
            }

            public String getDistance_km_if_located_outside() {
                return Distance_km_if_located_outside;
            }

            public void setDistance_km_if_located_outside(String distance_km_if_located_outside) {
                Distance_km_if_located_outside = distance_km_if_located_outside;
            }
        }

        public ans getPrimary_School_Govt() {
            return Primary_School_Govt;
        }

        public void setPrimary_School_Govt(ans primary_School_Govt) {
            Primary_School_Govt = primary_School_Govt;
        }

        public ans getPrimary_School_Private() {
            return Primary_School_Private;
        }

        public void setPrimary_School_Private(ans primary_School_Private) {
            Primary_School_Private = primary_School_Private;
        }

        public ans getMiddle_School_Govt() {
            return Middle_School_Govt;
        }

        public void setMiddle_School_Govt(ans middle_School_Govt) {
            Middle_School_Govt = middle_School_Govt;
        }

        public ans getMiddle_School_Private() {
            return Middle_School_Private;
        }

        public void setMiddle_School_Private(ans middle_School_Private) {
            Middle_School_Private = middle_School_Private;
        }

        public ans getSecondary_School_Private() {
            return Secondary_School_Private;
        }

        public void setSecondary_School_Private(ans secondary_School_Private) {
            Secondary_School_Private = secondary_School_Private;
        }

        public ans getSecondary_School_Govt() {
            return Secondary_School_Govt;
        }

        public void setSecondary_School_Govt(ans secondary_School_Govt) {
            Secondary_School_Govt = secondary_School_Govt;
        }

        public ans getITI_Diploma_institutes_Govt() {
            return ITI_Diploma_institutes_Govt;
        }

        public void setITI_Diploma_institutes_Govt(ans ITI_Diploma_institutes_Govt) {
            this.ITI_Diploma_institutes_Govt = ITI_Diploma_institutes_Govt;
        }

        public ans getITI_Diploma_institutes_Private() {
            return ITI_Diploma_institutes_Private;
        }

        public void setITI_Diploma_institutes_Private(ans ITI_Diploma_institutes_Private) {
            this.ITI_Diploma_institutes_Private = ITI_Diploma_institutes_Private;
        }

        public ans getCollege_Govt() {
            return College_Govt;
        }

        public void setCollege_Govt(ans college_Govt) {
            College_Govt = college_Govt;
        }

        public ans getCollege_Private() {
            return College_Private;
        }

        public void setCollege_Private(ans college_Private) {
            College_Private = college_Private;
        }

        public ans getBanks_ATM() {
            return Banks_ATM;
        }

        public void setBanks_ATM(ans banks_ATM) {
            Banks_ATM = banks_ATM;
        }

        public ans getPrimary_Health_Centers() {
            return Primary_Health_Centers;
        }

        public void setPrimary_Health_Centers(ans primary_Health_Centers) {
            Primary_Health_Centers = primary_Health_Centers;
        }

        public ans getCivil_Hospital() {
            return Civil_Hospital;
        }

        public void setCivil_Hospital(ans civil_Hospital) {
            Civil_Hospital = civil_Hospital;
        }

        public ans getSHG() {
            return SHG;
        }

        public void setSHG(ans SHG) {
            this.SHG = SHG;
        }

        public ans getNGO() {
            return NGO;
        }

        public void setNGO(ans NGO) {
            this.NGO = NGO;
        }

        public ans getJan_Aushadhi_Yojana_Kendra() {
            return Jan_Aushadhi_Yojana_Kendra;
        }

        public void setJan_Aushadhi_Yojana_Kendra(ans jan_Aushadhi_Yojana_Kendra) {
            Jan_Aushadhi_Yojana_Kendra = jan_Aushadhi_Yojana_Kendra;
        }

        public ans getPost_Office() {
            return Post_Office;
        }

        public void setPost_Office(ans post_Office) {
            Post_Office = post_Office;
        }

        public ans getGas_agencies() {
            return Gas_agencies;
        }

        public void setGas_agencies(ans gas_agencies) {
            Gas_agencies = gas_agencies;
        }

        public ans getTraining_Centres_and_specify_which() {
            return Training_Centres_and_specify_which;
        }

        public void setTraining_Centres_and_specify_which(ans training_Centres_and_specify_which) {
            Training_Centres_and_specify_which = training_Centres_and_specify_which;
        }

        public ans getElectricity_Office() {
            return Electricity_Office;
        }

        public void setElectricity_Office(ans electricity_Office) {
            Electricity_Office = electricity_Office;
        }

        public ans getAnganwadi_Kendra() {
            return Anganwadi_Kendra;
        }

        public void setAnganwadi_Kendra(ans anganwadi_Kendra) {
            Anganwadi_Kendra = anganwadi_Kendra;
        }

        public ans getPetrol_Pumps_in_village() {
            return Petrol_Pumps_in_village;
        }

        public void setPetrol_Pumps_in_village(ans petrol_Pumps_in_village) {
            Petrol_Pumps_in_village = petrol_Pumps_in_village;
        }

        public ans getKisan_Sewa_Kendra() {
            return Kisan_Sewa_Kendra;
        }

        public void setKisan_Sewa_Kendra(ans kisan_Sewa_Kendra) {
            Kisan_Sewa_Kendra = kisan_Sewa_Kendra;
        }

        public ans getKrishi_Mandi() {
            return Krishi_Mandi;
        }

        public void setKrishi_Mandi(ans krishi_Mandi) {
            Krishi_Mandi = krishi_Mandi;
        }

        public ans getFare_Price_Shop() {
            return Fare_Price_Shop;
        }

        public void setFare_Price_Shop(ans fare_Price_Shop) {
            Fare_Price_Shop = fare_Price_Shop;
        }

        public ans getMilk_Cooperative() {
            return Milk_Cooperative;
        }

        public void setMilk_Cooperative(ans milk_Cooperative) {
            Milk_Cooperative = milk_Cooperative;
        }

        public ans getRailway_Station() {
            return Railway_Station;
        }

        public void setRailway_Station(ans railway_Station) {
            Railway_Station = railway_Station;
        }

        public ans getBus_Stop() {
            return Bus_Stop;
        }

        public void setBus_Stop(ans bus_Stop) {
            Bus_Stop = bus_Stop;
        }

        public ans getVeterinary_Care_Centre() {
            return Veterinary_Care_Centre;
        }

        public void setVeterinary_Care_Centre(ans veterinary_Care_Centre) {
            Veterinary_Care_Centre = veterinary_Care_Centre;
        }

        public ans getSports_Facility() {
            return Sports_Facility;
        }

        public void setSports_Facility(ans sports_Facility) {
            Sports_Facility = sports_Facility;
        }

        public ans getNumber_Common_sanitation() {
            return Number_Common_sanitation;
        }

        public void setNumber_Common_sanitation(ans number_Common_sanitation) {
            Number_Common_sanitation = number_Common_sanitation;
        }
    }

    public class Village_Conn{
        private String Distance_of_the_village_from_nearest_Highway;
        private String Is_the_village_connected_to_the_above_by_a_pacca_road;
        private String What_is_the_mode_of_transport_available;
        private String Frequency_of_the_available_mode_of_transport;
        private road Length_of_internal_roads;
        private connectingRoad if_yes_details_of_the_approach_road;

        public Village_Conn(){
            Length_of_internal_roads=new road();
            if_yes_details_of_the_approach_road=new connectingRoad();
        }

        public class road{
            private String kachha;
            private String Pakkka;
            private String Total;

//            public road(String kachha, String pakkka, String total) {
//                this.kachha = kachha;
//                Pakkka = pakkka;
//                Total = total;
//            }

            public String getKachha() {
                return kachha;
            }

            public void setKachha(String kachha) {
                this.kachha = kachha;
            }

            public String getPakkka() {
                return Pakkka;
            }

            public void setPakkka(String pakkka) {
                Pakkka = pakkka;
            }

            public String getTotal() {
                return Total;
            }

            public void setTotal(String total) {
                Total = total;
            }
        }

        public class connectingRoad{
            private String Length_of_the_Road;
            private String Year_of_construction;
            private String Scheme_under_which_constructed;
            private String Present_Status;

            public String getLength_of_the_Road() {
                return Length_of_the_Road;
            }

            public void setLength_of_the_Road(String length_of_the_Road) {
                Length_of_the_Road = length_of_the_Road;
            }

            public String getYear_of_construction() {
                return Year_of_construction;
            }

            public void setYear_of_construction(String year_of_construction) {
                Year_of_construction = year_of_construction;
            }

            public String getScheme_under_which_constructed() {
                return Scheme_under_which_constructed;
            }

            public void setScheme_under_which_constructed(String scheme_under_which_constructed) {
                Scheme_under_which_constructed = scheme_under_which_constructed;
            }

            public String getPresent_Status() {
                return Present_Status;
            }

            public void setPresent_Status(String present_Status) {
                Present_Status = present_Status;
            }
        }

        public String getDistance_of_the_village_from_nearest_Highway() {
            return Distance_of_the_village_from_nearest_Highway;
        }

        public void setDistance_of_the_village_from_nearest_Highway(String distance_of_the_village_from_nearest_Highway) {
            Distance_of_the_village_from_nearest_Highway = distance_of_the_village_from_nearest_Highway;
        }

        public String getIs_the_village_connected_to_the_above_by_a_pacca_road() {
            return Is_the_village_connected_to_the_above_by_a_pacca_road;
        }

        public void setIs_the_village_connected_to_the_above_by_a_pacca_road(String is_the_village_connected_to_the_above_by_a_pacca_road) {
            Is_the_village_connected_to_the_above_by_a_pacca_road = is_the_village_connected_to_the_above_by_a_pacca_road;
        }

        public String getWhat_is_the_mode_of_transport_available() {
            return What_is_the_mode_of_transport_available;
        }

        public void setWhat_is_the_mode_of_transport_available(String what_is_the_mode_of_transport_available) {
            What_is_the_mode_of_transport_available = what_is_the_mode_of_transport_available;
        }

        public String getFrequency_of_the_available_mode_of_transport() {
            return Frequency_of_the_available_mode_of_transport;
        }

        public void setFrequency_of_the_available_mode_of_transport(String frequency_of_the_available_mode_of_transport) {
            Frequency_of_the_available_mode_of_transport = frequency_of_the_available_mode_of_transport;
        }

        public road getLength_of_internal_roads() {
            return Length_of_internal_roads;
        }

        public void setLength_of_internal_roads(road length_of_internal_roads) {
            Length_of_internal_roads = length_of_internal_roads;
        }

        public connectingRoad getIf_yes_details_of_the_approach_road() {
            return if_yes_details_of_the_approach_road;
        }

        public void setIf_yes_details_of_the_approach_road(connectingRoad if_yes_details_of_the_approach_road) {
            this.if_yes_details_of_the_approach_road = if_yes_details_of_the_approach_road;
        }
    }

    public class sanitation{
        private String Do_you_have_sanitation_system_in_your_area;
        private String How_many_people_are_using_it;
        private String Type_of_system;
        private String Where_does_the_blackwater_discharge;
        private String Where_do_they_discharge_the_greywater;

        public String getDo_you_have_sanitation_system_in_your_area() {
            return Do_you_have_sanitation_system_in_your_area;
        }

        public void setDo_you_have_sanitation_system_in_your_area(String do_you_have_sanitation_system_in_your_area) {
            Do_you_have_sanitation_system_in_your_area = do_you_have_sanitation_system_in_your_area;
        }

        public String getHow_many_people_are_using_it() {
            return How_many_people_are_using_it;
        }

        public void setHow_many_people_are_using_it(String how_many_people_are_using_it) {
            How_many_people_are_using_it = how_many_people_are_using_it;
        }

        public String getType_of_system() {
            return Type_of_system;
        }

        public void setType_of_system(String type_of_system) {
            Type_of_system = type_of_system;
        }

        public String getWhere_does_the_blackwater_discharge() {
            return Where_does_the_blackwater_discharge;
        }

        public void setWhere_does_the_blackwater_discharge(String where_does_the_blackwater_discharge) {
            Where_does_the_blackwater_discharge = where_does_the_blackwater_discharge;
        }

        public String getWhere_do_they_discharge_the_greywater() {
            return Where_do_they_discharge_the_greywater;
        }

        public void setWhere_do_they_discharge_the_greywater(String where_do_they_discharge_the_greywater) {
            Where_do_they_discharge_the_greywater = where_do_they_discharge_the_greywater;
        }
    }

    public class land_forst{
        private String Type_of_Forest;
        private String Community_Forest;
        private String Government_Forest;
        private String Main_Forest_Trees_and_Shrub_Species;

        private ArrayList<ans> Energy_Plantation;

        public land_forst(){
            Energy_Plantation=new ArrayList<>();
        }

        public void addEnergy_Plantation(){
            Energy_Plantation.add(new ans());
        }

        public ArrayList<ans> getEnergy_Plantation() {
            return Energy_Plantation;
        }

        public void setEnergy_Plantation(ArrayList<ans> energy_Plantation) {
            Energy_Plantation = energy_Plantation;
        }

        public String getType_of_Forest() {
            return Type_of_Forest;
        }

        public void setType_of_Forest(String type_of_Forest) {
            Type_of_Forest = type_of_Forest;
        }

        public String getCommunity_Forest() {
            return Community_Forest;
        }

        public void setCommunity_Forest(String community_Forest) {
            Community_Forest = community_Forest;
        }

        public String getGovernment_Forest() {
            return Government_Forest;
        }

        public void setGovernment_Forest(String government_Forest) {
            Government_Forest = government_Forest;
        }

        public String getMain_Forest_Trees_and_Shrub_Species() {
            return Main_Forest_Trees_and_Shrub_Species;
        }

        public void setMain_Forest_Trees_and_Shrub_Species(String main_Forest_Trees_and_Shrub_Species) {
            Main_Forest_Trees_and_Shrub_Species = main_Forest_Trees_and_Shrub_Species;
        }

        public class ans{
            private String Species;
            private String Area;

            public String getSpecies() {
                return Species;
            }

            public void setSpecies(String species) {
                Species = species;
            }

            public String getArea() {
                return Area;
            }

            public void setArea(String area) {
                Area = area;
            }
        }
    }

    public class villageRequirments{

        private ArrayList<appl> Panchayat_Office;
        private ArrayList<appl> Dispensary;
        private ArrayList<appl> Community_Halls;
        private ArrayList<appl> Street_Lighting;
        private ArrayList<appl> Dharamashala;
        private ArrayList<appl> Social_Organisations;
        private ArrayList<appl> Training_cum_Production_Centres;

        public villageRequirments(){
            Panchayat_Office=new ArrayList<>();
            Dispensary=new ArrayList<>();
            Community_Halls=new ArrayList<>();
            Street_Lighting=new ArrayList<>();
            Dharamashala=new ArrayList<>();
            Social_Organisations=new ArrayList<>();
            Training_cum_Production_Centres=new ArrayList<>();
        }

        public void AddPanchayat_Office(){
            Panchayat_Office.add(new appl());
        }

        public void AddDispensary(){
            Dispensary.add(new appl());
        }

        public void AddCommunity_Halls(){Community_Halls.add(new appl());}
        public void AddStreet_Lighting(){Street_Lighting.add(new appl());}
        public void AddDharamashala(){Dharamashala.add(new appl());}
        public void AddSocial_Organisations(){Social_Organisations.add(new appl());}
        public void AddTraining_cum_Production_Centres(){Training_cum_Production_Centres.add(new appl());}

        public class appl{
            private String Electrical_Appliances;

            private int number_requred;
            private String duration;

            public int getNumber_requred() {
                return number_requred;
            }

            public void setNumber_requred(int number_requred) {
                this.number_requred = number_requred;
            }

            public String getElectrical_Appliances() {
                return Electrical_Appliances;
            }

            public void setElectrical_Appliances(String electrical_Appliances) {
                Electrical_Appliances = electrical_Appliances;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }
        }

        public ArrayList<appl> getPanchayat_Office() {
            return Panchayat_Office;
        }

        public void setPanchayat_Office(ArrayList<appl> panchayat_Office) {
            Panchayat_Office = panchayat_Office;
        }

        public ArrayList<appl> getDispensary() {
            return Dispensary;
        }

        public void setDispensary(ArrayList<appl> dispensary) {
            Dispensary = dispensary;
        }

        public ArrayList<appl> getCommunity_Halls() {
            return Community_Halls;
        }

        public void setCommunity_Halls(ArrayList<appl> community_Halls) {
            Community_Halls = community_Halls;
        }

        public ArrayList<appl> getStreet_Lighting() {
            return Street_Lighting;
        }

        public void setStreet_Lighting(ArrayList<appl> street_Lighting) {
            Street_Lighting = street_Lighting;
        }

        public ArrayList<appl> getDharamashala() {
            return Dharamashala;
        }

        public void setDharamashala(ArrayList<appl> dharamashala) {
            Dharamashala = dharamashala;
        }

        public ArrayList<appl> getSocial_Organisations() {
            return Social_Organisations;
        }

        public void setSocial_Organisations(ArrayList<appl> social_Organisations) {
            Social_Organisations = social_Organisations;
        }

        public ArrayList<appl> getTraining_cum_Production_Centres() {
            return Training_cum_Production_Centres;
        }

        public void setTraining_cum_Production_Centres(ArrayList<appl> training_cum_Production_Centres) {
            Training_cum_Production_Centres = training_cum_Production_Centres;
        }
    }

    public class SolidWaste{
        private String Solid_Waste_management_facility;
        private String Current_cost_of_management;
        private String Funding_from_any_govt_other_schemes;
        private String Current_mode_of_collection;

        private wasteType Organics_from_Kitchen;
        private wasteType Plastics;
        private wasteType Recyclables;
        private wasteType Non_Recyclables;
        private wasteType Clothes_Slippers_Bags;
        private wasteType Bio_medical_waste;
        private wasteType Sanitary_napkins;
        private wasteType Agricultural_Biomass;

        public SolidWaste(){
            Organics_from_Kitchen=new wasteType();
            Plastics=new wasteType();
            Recyclables=new wasteType();
            Non_Recyclables=new wasteType();
            Clothes_Slippers_Bags=new wasteType();
            Bio_medical_waste=new wasteType();
            Sanitary_napkins=new wasteType();
            Agricultural_Biomass=new wasteType();
        }

        public class wasteType{
            private String Mode_of_collection;
            private String Current_management_strategy;

            public String getMode_of_collection() {
                return Mode_of_collection;
            }

            public void setMode_of_collection(String mode_of_collection) {
                Mode_of_collection = mode_of_collection;
            }

            public String getCurrent_management_strategy() {
                return Current_management_strategy;
            }

            public void setCurrent_management_strategy(String current_management_strategy) {
                Current_management_strategy = current_management_strategy;
            }
        }

        public String getSolid_Waste_management_facility() {
            return Solid_Waste_management_facility;
        }

        public void setSolid_Waste_management_facility(String solid_Waste_management_facility) {
            Solid_Waste_management_facility = solid_Waste_management_facility;
        }

        public String getCurrent_cost_of_management() {
            return Current_cost_of_management;
        }

        public void setCurrent_cost_of_management(String current_cost_of_management) {
            Current_cost_of_management = current_cost_of_management;
        }

        public String getFunding_from_any_govt_other_schemes() {
            return Funding_from_any_govt_other_schemes;
        }

        public void setFunding_from_any_govt_other_schemes(String funding_from_any_govt_other_schemes) {
            Funding_from_any_govt_other_schemes = funding_from_any_govt_other_schemes;
        }

        public String getCurrent_mode_of_collection() {
            return Current_mode_of_collection;
        }

        public void setCurrent_mode_of_collection(String current_mode_of_collection) {
            Current_mode_of_collection = current_mode_of_collection;
        }

        public wasteType getOrganics_from_Kitchen() {
            return Organics_from_Kitchen;
        }

        public void setOrganics_from_Kitchen(wasteType organics_from_Kitchen) {
            Organics_from_Kitchen = organics_from_Kitchen;
        }

        public wasteType getPlastics() {
            return Plastics;
        }

        public void setPlastics(wasteType plastics) {
            Plastics = plastics;
        }

        public wasteType getRecyclables() {
            return Recyclables;
        }

        public void setRecyclables(wasteType recyclables) {
            Recyclables = recyclables;
        }

        public wasteType getNon_Recyclables() {
            return Non_Recyclables;
        }

        public void setNon_Recyclables(wasteType non_Recyclables) {
            Non_Recyclables = non_Recyclables;
        }

        public wasteType getClothes_Slippers_Bags() {
            return Clothes_Slippers_Bags;
        }

        public void setClothes_Slippers_Bags(wasteType clothes_Slippers_Bags) {
            Clothes_Slippers_Bags = clothes_Slippers_Bags;
        }

        public wasteType getBio_medical_waste() {
            return Bio_medical_waste;
        }

        public void setBio_medical_waste(wasteType bio_medical_waste) {
            Bio_medical_waste = bio_medical_waste;
        }

        public wasteType getSanitary_napkins() {
            return Sanitary_napkins;
        }

        public void setSanitary_napkins(wasteType sanitary_napkins) {
            Sanitary_napkins = sanitary_napkins;
        }

        public wasteType getAgricultural_Biomass() {
            return Agricultural_Biomass;
        }

        public void setAgricultural_Biomass(wasteType agricultural_Biomass) {
            Agricultural_Biomass = agricultural_Biomass;
        }
    }

    public class WasteTreatment{
        private String Do_you_have_any_treatment_system_of_wastewater;
        private String Type_of_system;
        private String Capacity_of_the_system;
        private String Operation_and_maintenance_cost;
        private String Total_Cost_of_the_system;
        private String Is_greywater_treated_in_the_same_system;
        private String If_no_then_where_do_they_discharge_the_greywater;

        public String getDo_you_have_any_treatment_system_of_wastewater() {
            return Do_you_have_any_treatment_system_of_wastewater;
        }

        public void setDo_you_have_any_treatment_system_of_wastewater(String do_you_have_any_treatment_system_of_wastewater) {
            Do_you_have_any_treatment_system_of_wastewater = do_you_have_any_treatment_system_of_wastewater;
        }

        public String getType_of_system() {
            return Type_of_system;
        }

        public void setType_of_system(String type_of_system) {
            Type_of_system = type_of_system;
        }

        public String getCapacity_of_the_system() {
            return Capacity_of_the_system;
        }

        public void setCapacity_of_the_system(String capacity_of_the_system) {
            Capacity_of_the_system = capacity_of_the_system;
        }

        public String getOperation_and_maintenance_cost() {
            return Operation_and_maintenance_cost;
        }

        public void setOperation_and_maintenance_cost(String operation_and_maintenance_cost) {
            Operation_and_maintenance_cost = operation_and_maintenance_cost;
        }

        public String getTotal_Cost_of_the_system() {
            return Total_Cost_of_the_system;
        }

        public void setTotal_Cost_of_the_system(String total_Cost_of_the_system) {
            Total_Cost_of_the_system = total_Cost_of_the_system;
        }

        public String getIs_greywater_treated_in_the_same_system() {
            return Is_greywater_treated_in_the_same_system;
        }

        public void setIs_greywater_treated_in_the_same_system(String is_greywater_treated_in_the_same_system) {
            Is_greywater_treated_in_the_same_system = is_greywater_treated_in_the_same_system;
        }

        public String getIf_no_then_where_do_they_discharge_the_greywater() {
            return If_no_then_where_do_they_discharge_the_greywater;
        }

        public void setIf_no_then_where_do_they_discharge_the_greywater(String if_no_then_where_do_they_discharge_the_greywater) {
            If_no_then_where_do_they_discharge_the_greywater = if_no_then_where_do_they_discharge_the_greywater;
        }
    }
}
