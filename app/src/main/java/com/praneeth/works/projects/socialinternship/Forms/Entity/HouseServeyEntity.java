package com.praneeth.works.projects.socialinternship.Forms.Entity;

import java.util.ArrayList;

public class HouseServeyEntity {

    private String Village;
    private String Gram_Panchayat;
    private String Ward_No;
    private String Block;
    private String District;
    private String State;
    private Profile Respondent_Profile;
    private general General_Household_information;
    private ArrayList<family_info> family_member_information;
    private migration Migration_status_in_a_family;
    private schemes information_of_Government_Schemes;
    private energy Source_of_energy;
    private land Landholding_information;
    private Agricultural Agricultural_inputs;
    private ArrayList<agri_produce> Agricultural_produce_in_a_normal_year;
    private livestock Livestock_number;
    private ArrayList<problem> Major_problem_in_village;

    private waterSource Source_of_Water;

    private String Date_of_Survey;

    private String Surveyed_by;

    public HouseServeyEntity(){
        Respondent_Profile=new Profile();
        General_Household_information=new general();
        family_member_information=new ArrayList<>();
        Migration_status_in_a_family=new migration();
        information_of_Government_Schemes=new schemes();
        Source_of_energy=new energy();
        Landholding_information=new land();
        Agricultural_inputs=new Agricultural();
        Agricultural_produce_in_a_normal_year=new ArrayList<>();
        Livestock_number=new livestock();
        Major_problem_in_village=new ArrayList<>();
        Source_of_Water=new waterSource();
    }

    public String getDate_of_Survey() {
        return Date_of_Survey;
    }

    public void setDate_of_Survey(String date_of_Survey) {
        Date_of_Survey = date_of_Survey;
    }

    public String getSurveyed_by() {
        return Surveyed_by;
    }

    public void setSurveyed_by(String surveyed_by) {
        Surveyed_by = surveyed_by;
    }

    public void addAgricultural_produce_in_a_normal_year(agri_produce obj){
        Agricultural_produce_in_a_normal_year.add(obj);
    }

    public void addProblem(problem obj){
        Major_problem_in_village.add(obj);
    }

    public class Profile{
        private String Name;
        private String Gender;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getGender() {
            return Gender;
        }

        public void setGender(String gender) {
            Gender = gender;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getRelationship_with_Head_of_Household() {
            return Relationship_with_Head_of_Household;
        }

        public void setRelationship_with_Head_of_Household(String relationship_with_Head_of_Household) {
            Relationship_with_Head_of_Household = relationship_with_Head_of_Household;
        }

        public String getContact_Number() {
            return Contact_Number;
        }

        public void setContact_Number(String contact_Number) {
            Contact_Number = contact_Number;
        }

        private int Age;
        private String Relationship_with_Head_of_Household;
        private String Contact_Number;
    }

    public class general{
        private String Name_of_the_head;
        private String Gender;
        private int No_of_family_members;
        private String Category;
        private String Poverty_Status;
        private String Own_House;
        private String Types_of_House;
        private String Toliet;
        private String Drainage_linked_to_House;
        private String Waste_Collection_System;
        private String Compost_Pit;
        private String Biogas_plant;


        public String getName_of_the_head() {
            return Name_of_the_head;
        }

        public void setName_of_the_head(String name_of_the_head) {
            Name_of_the_head = name_of_the_head;
        }

        public String getGender() {
            return Gender;
        }

        public void setGender(String gender) {
            Gender = gender;
        }

        public int getNo_of_family_members() {
            return No_of_family_members;
        }

        public void setNo_of_family_members(int no_of_family_members) {
            No_of_family_members = no_of_family_members;
        }

        public String getCategory() {
            return Category;
        }

        public void setCategory(String category) {
            Category = category;
        }

        public String getPoverty_Status() {
            return Poverty_Status;
        }

        public void setPoverty_Status(String poverty_Status) {
            Poverty_Status = poverty_Status;
        }

        public String getOwn_House() {
            return Own_House;
        }

        public void setOwn_House(String own_House) {
            Own_House = own_House;
        }

        public String getTypes_of_House() {
            return Types_of_House;
        }

        public void setTypes_of_House(String types_of_House) {
            Types_of_House = types_of_House;
        }

        public String getToliet() {
            return Toliet;
        }

        public void setToliet(String toliet) {
            Toliet = toliet;
        }

        public String getDrainage_linked_to_House() {
            return Drainage_linked_to_House;
        }

        public void setDrainage_linked_to_House(String drainage_linked_to_House) {
            Drainage_linked_to_House = drainage_linked_to_House;
        }

        public String getWaste_Collection_System() {
            return Waste_Collection_System;
        }

        public void setWaste_Collection_System(String waste_Collection_System) {
            Waste_Collection_System = waste_Collection_System;
        }

        public String getCompost_Pit() {
            return Compost_Pit;
        }

        public void setCompost_Pit(String compost_Pit) {
            Compost_Pit = compost_Pit;
        }

        public String getBiogas_plant() {
            return Biogas_plant;
        }

        public void setBiogas_plant(String biogas_plant) {
            Biogas_plant = biogas_plant;
        }
    }

   public class family_info{
        private String Name;
        private int Age;
        private String Sex;
        private String Level_of_Education;
        private String Going_to_AWS_or_School_or_College;
        private String Aadhaar_Card;
        private String Bank_Account;
        private String Computer_Literate;
        private String Social_Security;
        private String Major_Health_problem;
        private String MNREGA_Job_Card;
        private String Self_Help_Groups;
        private String Occupations;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getSex() {
            return Sex;
        }

        public void setSex(String sex) {
            Sex = sex;
        }

        public String getLevel_of_Education() {
            return Level_of_Education;
        }

        public void setLevel_of_Education(String level_of_Education) {
            Level_of_Education = level_of_Education;
        }

        public String getGoing_to_AWS_or_School_or_College() {
            return Going_to_AWS_or_School_or_College;
        }

        public void setGoing_to_AWS_or_School_or_College(String going_to_AWS_or_School_or_College) {
            Going_to_AWS_or_School_or_College = going_to_AWS_or_School_or_College;
        }

        public String getAadhaar_Card() {
            return Aadhaar_Card;
        }

        public void setAadhaar_Card(String aadhaar_Card) {
            Aadhaar_Card = aadhaar_Card;
        }

        public String getBank_Account() {
            return Bank_Account;
        }

        public void setBank_Account(String bank_Account) {
            Bank_Account = bank_Account;
        }

        public String getComputer_Literate() {
            return Computer_Literate;
        }

        public void setComputer_Literate(String computer_Literate) {
            Computer_Literate = computer_Literate;
        }

        public String getSocial_Security() {
            return Social_Security;
        }

        public void setSocial_Security(String social_Security) {
            Social_Security = social_Security;
        }

        public String getMajor_Health_problem() {
            return Major_Health_problem;
        }

        public void setMajor_Health_problem(String major_Health_problem) {
            Major_Health_problem = major_Health_problem;
        }

        public String getMNREGA_Job_Card() {
            return MNREGA_Job_Card;
        }

        public void setMNREGA_Job_Card(String MNREGA_Job_Card) {
            this.MNREGA_Job_Card = MNREGA_Job_Card;
        }

        public String getSelf_Help_Groups() {
            return Self_Help_Groups;
        }

        public void setSelf_Help_Groups(String self_Help_Groups) {
            Self_Help_Groups = self_Help_Groups;
        }

        public String getOccupations() {
            return Occupations;
        }

        public void setOccupations(String occupations) {
            Occupations = occupations;
        }
    }

    public class migration{
        private String Did_any_of_them_migrate; //Does any member of the household migrate for Work?
        private int How_many_members;//If Yes How many members of the family migrated
        private double how_many_days_months;//Family migrates for how many days/ months?
        private double migration_is_taking;//Since how many years the migration is taking place?

        public String getDid_any_of_them_migrate() {
            return Did_any_of_them_migrate;
        }

        public void setDid_any_of_them_migrate(String did_any_of_them_migrate) {
            Did_any_of_them_migrate = did_any_of_them_migrate;
        }

        public int getHow_many_members() {
            return How_many_members;
        }

        public void setHow_many_members(int how_many_members) {
            How_many_members = how_many_members;
        }

        public double getHow_many_days_months() {
            return how_many_days_months;
        }

        public void setHow_many_days_months(double how_many_days_months) {
            this.how_many_days_months = how_many_days_months;
        }

        public double getMigration_is_taking() {
            return migration_is_taking;
        }

        public void setMigration_is_taking(double migration_is_taking) {
            this.migration_is_taking = migration_is_taking;
        }
    }

    public class schemes{
        private int PM_jan_dhan_yojana;
        private int sukanya_samridhi_yojana;
        private int mudra_yojana;
        private int pm_jivan_jyoti_bima_yojana;
        private int pm_sutaksha_Bima_Yojana;
        private int Atal_pension_Yojana;
        private int Kaushal_Vikas_Yojana;
        private int Janani_Suraksha_Yojana;

        private String Fasal_Bima_Yojana;
        private String Kisan_Credit_Card;
        private String Krishi_Sinchai_Yojana;
        private String Swachh_Bharat_Mission_Toilet;
        private String Soil_Health_Card;
        private String PM_Ujjwala_yojana;
        private String PM_Awas_Yojana;

        public int getPM_jan_dhan_yojana() {
            return PM_jan_dhan_yojana;
        }

        public void setPM_jan_dhan_yojana(int PM_jan_dhan_yojana) {
            this.PM_jan_dhan_yojana = PM_jan_dhan_yojana;
        }

        public int getSukanya_samridhi_yojana() {
            return sukanya_samridhi_yojana;
        }

        public void setSukanya_samridhi_yojana(int sukanya_samridhi_yojana) {
            this.sukanya_samridhi_yojana = sukanya_samridhi_yojana;
        }

        public int getMudra_yojana() {
            return mudra_yojana;
        }

        public void setMudra_yojana(int mudra_yojana) {
            this.mudra_yojana = mudra_yojana;
        }

        public int getPm_jivan_jyoti_bima_yojana() {
            return pm_jivan_jyoti_bima_yojana;
        }

        public void setPm_jivan_jyoti_bima_yojana(int pm_jivan_jyoti_bima_yojana) {
            this.pm_jivan_jyoti_bima_yojana = pm_jivan_jyoti_bima_yojana;
        }

        public int getPm_sutaksha_Bima_Yojana() {
            return pm_sutaksha_Bima_Yojana;
        }

        public void setPm_sutaksha_Bima_Yojana(int pm_sutaksha_Bima_Yojana) {
            this.pm_sutaksha_Bima_Yojana = pm_sutaksha_Bima_Yojana;
        }

        public int getAtal_pension_Yojana() {
            return Atal_pension_Yojana;
        }

        public void setAtal_pension_Yojana(int atal_pension_Yojana) {
            Atal_pension_Yojana = atal_pension_Yojana;
        }

        public int getKaushal_Vikas_Yojana() {
            return Kaushal_Vikas_Yojana;
        }

        public void setKaushal_Vikas_Yojana(int kaushal_Vikas_Yojana) {
            Kaushal_Vikas_Yojana = kaushal_Vikas_Yojana;
        }

        public int getJanani_Suraksha_Yojana() {
            return Janani_Suraksha_Yojana;
        }

        public void setJanani_Suraksha_Yojana(int janani_Suraksha_Yojana) {
            Janani_Suraksha_Yojana = janani_Suraksha_Yojana;
        }

        public String getFasal_Bima_Yojana() {
            return Fasal_Bima_Yojana;
        }

        public void setFasal_Bima_Yojana(String fasal_Bima_Yojana) {
            Fasal_Bima_Yojana = fasal_Bima_Yojana;
        }

        public String getKisan_Credit_Card() {
            return Kisan_Credit_Card;
        }

        public void setKisan_Credit_Card(String kisan_Credit_Card) {
            Kisan_Credit_Card = kisan_Credit_Card;
        }

        public String getKrishi_Sinchai_Yojana() {
            return Krishi_Sinchai_Yojana;
        }

        public void setKrishi_Sinchai_Yojana(String krishi_Sinchai_Yojana) {
            Krishi_Sinchai_Yojana = krishi_Sinchai_Yojana;
        }

        public String getSwachh_Bharat_Mission_Toilet() {
            return Swachh_Bharat_Mission_Toilet;
        }

        public void setSwachh_Bharat_Mission_Toilet(String swachh_Bharat_Mission_Toilet) {
            Swachh_Bharat_Mission_Toilet = swachh_Bharat_Mission_Toilet;
        }

        public String getSoil_Health_Card() {
            return Soil_Health_Card;
        }

        public void setSoil_Health_Card(String soil_Health_Card) {
            Soil_Health_Card = soil_Health_Card;
        }

        public String getPM_Ujjwala_yojana() {
            return PM_Ujjwala_yojana;
        }

        public void setPM_Ujjwala_yojana(String PM_Ujjwala_yojana) {
            this.PM_Ujjwala_yojana = PM_Ujjwala_yojana;
        }

        public String getPM_Awas_Yojana() {
            return PM_Awas_Yojana;
        }

        public void setPM_Awas_Yojana(String PM_Awas_Yojana) {
            this.PM_Awas_Yojana = PM_Awas_Yojana;
        }
    }

    public class energy{
        private String Electricity_Connection_to_Household;
        private int Electricity_Availability;
        private String Lighting;
        private String Cooking;
        private String Methion_if_Any_Other;
        private String If_cooking_in_chullah;
        private ArrayList<Appliances> appliances;

        public energy(){
            if(appliances==null){
                appliances=new ArrayList<>();
            }
        }

        public void addAppliances(Appliances obj){
            appliances.add(obj);
        }

        public class Appliances{
            private String name;
            private int nos;
            private int Duration;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getNos() {
                return nos;
            }

            public void setNos(int nos) {
                this.nos = nos;
            }

            public int getDuration() {
                return Duration;
            }

            public void setDuration(int duration) {
                Duration = duration;
            }
        }

        public String getElectricity_Connection_to_Household() {
            return Electricity_Connection_to_Household;
        }

        public void setElectricity_Connection_to_Household(String electricity_Connection_to_Household) {
            Electricity_Connection_to_Household = electricity_Connection_to_Household;
        }

        public int getElectricity_Availability() {
            return Electricity_Availability;
        }

        public void setElectricity_Availability(int electricity_Availability) {
            Electricity_Availability = electricity_Availability;
        }

        public String getLighting() {
            return Lighting;
        }

        public void setLighting(String lighting) {
            Lighting = lighting;
        }

        public String getCooking() {
            return Cooking;
        }

        public void setCooking(String cooking) {
            Cooking = cooking;
        }

        public String getMethion_if_Any_Other() {
            return Methion_if_Any_Other;
        }

        public void setMethion_if_Any_Other(String methion_if_Any_Other) {
            Methion_if_Any_Other = methion_if_Any_Other;
        }

        public String getIf_cooking_in_chullah() {
            return If_cooking_in_chullah;
        }

        public void setIf_cooking_in_chullah(String if_cooking_in_chullah) {
            If_cooking_in_chullah = if_cooking_in_chullah;
        }

        public ArrayList<Appliances> getAppliances() {
            return appliances;
        }

        public void setAppliances(ArrayList<Appliances> appliances) {
            this.appliances = appliances;
        }
    }

    public class land{
        private double Total;
        private double Cultivable;
        private double Irrigated_Area;
        private double Un_irrigated_Area;
        private double Barren_Area;
        private double Uncultivable_Area;

        public double getTotal() {
            return Total;
        }

        public void setTotal(double total) {
            Total = total;
        }

        public double getCultivable() {
            return Cultivable;
        }

        public void setCultivable(double cultivable) {
            Cultivable = cultivable;
        }

        public double getIrrigated_Area() {
            return Irrigated_Area;
        }

        public void setIrrigated_Area(double irrigated_Area) {
            Irrigated_Area = irrigated_Area;
        }

        public double getUn_irrigated_Area() {
            return Un_irrigated_Area;
        }

        public void setUn_irrigated_Area(double un_irrigated_Area) {
            Un_irrigated_Area = un_irrigated_Area;
        }

        public double getBarren_Area() {
            return Barren_Area;
        }

        public void setBarren_Area(double barren_Area) {
            Barren_Area = barren_Area;
        }

        public double getUncultivable_Area() {
            return Uncultivable_Area;
        }

        public void setUncultivable_Area(double uncultivable_Area) {
            Uncultivable_Area = uncultivable_Area;
        }
    }

    public class Agricultural{

        private ans Do_you_use_chemical_fertilisers;
        private ans do_you_use_chemical_insecticides;
        private ans Do_you_use_Chemical_Weedicide;
        private ans Do_you_organic_manures;
        private String Irrigation;
        private String Irrigation_System;

        public Agricultural(){
            Do_you_use_chemical_fertilisers=new ans();
            do_you_use_chemical_insecticides=new ans();
            Do_you_use_Chemical_Weedicide=new ans();
            Do_you_organic_manures=new ans();
        }

        public class ans{
            private String answer;
            private String if_yes;

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }

            public String getIf_yes() {
                return if_yes;
            }

            public void setIf_yes(String if_yes) {
                this.if_yes = if_yes;
            }
        }

        public ans getDo_you_use_chemical_fertilisers() {
            return Do_you_use_chemical_fertilisers;
        }

        public void setDo_you_use_chemical_fertilisers(ans do_you_use_chemical_fertilisers) {
            Do_you_use_chemical_fertilisers = do_you_use_chemical_fertilisers;
        }

        public ans getDo_you_use_chemical_insecticides() {
            return do_you_use_chemical_insecticides;
        }

        public void setDo_you_use_chemical_insecticides(ans do_you_use_chemical_insecticides) {
            this.do_you_use_chemical_insecticides = do_you_use_chemical_insecticides;
        }

        public ans getDo_you_use_Chemical_Weedicide() {
            return Do_you_use_Chemical_Weedicide;
        }

        public void setDo_you_use_Chemical_Weedicide(ans do_you_use_Chemical_Weedicide) {
            Do_you_use_Chemical_Weedicide = do_you_use_Chemical_Weedicide;
        }

        public ans getDo_you_organic_manures() {
            return Do_you_organic_manures;
        }

        public void setDo_you_organic_manures(ans do_you_organic_manures) {
            Do_you_organic_manures = do_you_organic_manures;
        }

        public String getIrrigation() {
            return Irrigation;
        }

        public void setIrrigation(String irrigation) {
            Irrigation = irrigation;
        }

        public String getIrrigation_System() {
            return Irrigation_System;
        }

        public void setIrrigation_System(String irrigation_System) {
            Irrigation_System = irrigation_System;
        }
    }

    public class agri_produce{
        private String crop;
        private double area;
        private double productivity;

        public String getCrop() {
            return crop;
        }

        public void setCrop(String crop) {
            this.crop = crop;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public double getProductivity() {
            return productivity;
        }

        public void setProductivity(double productivity) {
            this.productivity = productivity;
        }
    }

    public class livestock{
        private int cows;
        private int buffalo;
        private int sheep;
        private int calves;
        private int bullocks;
        private int Poultry;
        private String other;
        private String Shelter_for_livestock;
        private double Average_Daily_Production_Milk;
        private double Animal_waste;

        public int getCows() {
            return cows;
        }

        public void setCows(int cows) {
            this.cows = cows;
        }

        public int getBuffalo() {
            return buffalo;
        }

        public void setBuffalo(int buffalo) {
            this.buffalo = buffalo;
        }

        public int getSheep() {
            return sheep;
        }

        public void setSheep(int sheep) {
            this.sheep = sheep;
        }

        public int getCalves() {
            return calves;
        }

        public void setCalves(int calves) {
            this.calves = calves;
        }

        public int getBullocks() {
            return bullocks;
        }

        public void setBullocks(int bullocks) {
            this.bullocks = bullocks;
        }

        public int getPoultry() {
            return Poultry;
        }

        public void setPoultry(int poultry) {
            Poultry = poultry;
        }

        public String getOther() {
            return other;
        }

        public void setOther(String other) {
            this.other = other;
        }

        public String getShelter_for_livestock() {
            return Shelter_for_livestock;
        }

        public void setShelter_for_livestock(String shelter_for_livestock) {
            Shelter_for_livestock = shelter_for_livestock;
        }

        public double getAverage_Daily_Production_Milk() {
            return Average_Daily_Production_Milk;
        }

        public void setAverage_Daily_Production_Milk(double average_Daily_Production_Milk) {
            Average_Daily_Production_Milk = average_Daily_Production_Milk;
        }

        public double getAnimal_waste() {
            return Animal_waste;
        }

        public void setAnimal_waste(double animal_waste) {
            Animal_waste = animal_waste;
        }
    }

    public class problem{
        private String Problem;
        private String solution;

        public String getProblem() {
            return Problem;
        }

        public void setProblem(String problem) {
            Problem = problem;
        }

        public String getSolution() {
            return solution;
        }

        public void setSolution(String solution) {
            this.solution = solution;
        }
    }

    public class waterSource{

        private ans Piped_Water_at_Home;
        private ans Community_Water_Tap;
        private ans Hand_Pump;
        private ans Open_Well;
        private String Mode_of_Water_Storage;

        private String Any_other_source;

        public waterSource(){
            Piped_Water_at_Home=new ans();
            Community_Water_Tap=new ans();
            Hand_Pump=new ans();
            Open_Well=new ans();
        }


        public class ans{
            private String answer;
            private String Distance;

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }

            public String getDistance() {
                return Distance;
            }

            public void setDistance(String distance) {
                Distance = distance;
            }
        }

        public ans getPiped_Water_at_Home() {
            return Piped_Water_at_Home;
        }

        public void setPiped_Water_at_Home(ans piped_Water_at_Home) {
            Piped_Water_at_Home = piped_Water_at_Home;
        }

        public ans getCommunity_Water_Tap() {
            return Community_Water_Tap;
        }

        public void setCommunity_Water_Tap(ans community_Water_Tap) {
            Community_Water_Tap = community_Water_Tap;
        }

        public ans getHand_Pump() {
            return Hand_Pump;
        }

        public void setHand_Pump(ans hand_Pump) {
            Hand_Pump = hand_Pump;
        }

        public ans getOpen_Well() {
            return Open_Well;
        }

        public void setOpen_Well(ans open_Well) {
            Open_Well = open_Well;
        }

        public String getMode_of_Water_Storage() {
            return Mode_of_Water_Storage;
        }

        public void setMode_of_Water_Storage(String mode_of_Water_Storage) {
            Mode_of_Water_Storage = mode_of_Water_Storage;
        }

        public String getAny_other_source() {
            return Any_other_source;
        }

        public void setAny_other_source(String any_other_source) {
            Any_other_source = any_other_source;
        }
    }

    public void addMember(family_info obj){
        family_member_information.add(obj);
    }

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        Village = village;
    }

    public String getGram_Panchayat() {
        return Gram_Panchayat;
    }

    public void setGram_Panchayat(String gram_Panchayat) {
        Gram_Panchayat = gram_Panchayat;
    }

    public String getWard_No() {
        return Ward_No;
    }

    public void setWard_No(String ward_No) {
        Ward_No = ward_No;
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

    public Profile getRespondent_Profile() {
        return Respondent_Profile;
    }

    public void setRespondent_Profile(Profile respondent_Profile) {
        Respondent_Profile = respondent_Profile;
    }

    public general getGeneral_Household_information() {
        return General_Household_information;
    }

    public void setGeneral_Household_information(general general_Household_information) {
        General_Household_information = general_Household_information;
    }

    public ArrayList<family_info> getFamily_member_information() {
        return family_member_information;
    }

    public void setFamily_member_information(ArrayList<family_info> family_member_information) {
        this.family_member_information = family_member_information;
    }

    public migration getMigration_status_in_a_family() {
        return Migration_status_in_a_family;
    }

    public void setMigration_status_in_a_family(migration migration_status_in_a_family) {
        Migration_status_in_a_family = migration_status_in_a_family;
    }

    public schemes getInformation_of_Government_Schemes() {
        return information_of_Government_Schemes;
    }

    public void setInformation_of_Government_Schemes(schemes information_of_Government_Schemes) {
        this.information_of_Government_Schemes = information_of_Government_Schemes;
    }

    public energy getSource_of_energy() {
        return Source_of_energy;
    }

    public void setSource_of_energy(energy source_of_energy) {
        Source_of_energy = source_of_energy;
    }

    public land getLandholding_information() {
        return Landholding_information;
    }

    public void setLandholding_information(land landholding_information) {
        Landholding_information = landholding_information;
    }

    public Agricultural getAgricultural_inputs() {
        return Agricultural_inputs;
    }

    public void setAgricultural_inputs(Agricultural agricultural_inputs) {
        Agricultural_inputs = agricultural_inputs;
    }

    public ArrayList<agri_produce> getAgricultural_produce_in_a_normal_year() {
        return Agricultural_produce_in_a_normal_year;
    }

    public void setAgricultural_produce_in_a_normal_year(ArrayList<agri_produce> agricultural_produce_in_a_normal_year) {
        Agricultural_produce_in_a_normal_year = agricultural_produce_in_a_normal_year;
    }

    public livestock getLivestock_number() {
        return Livestock_number;
    }

    public void setLivestock_number(livestock livestock_number) {
        Livestock_number = livestock_number;
    }

    public ArrayList<problem> getMajor_problem_in_village() {
        return Major_problem_in_village;
    }

    public void setMajor_problem_in_village(ArrayList<problem> major_problem_in_village) {
        Major_problem_in_village = major_problem_in_village;
    }

    public waterSource getSource_of_Water() {
        return Source_of_Water;
    }

    public void setSource_of_Water(waterSource source_of_Water) {
        Source_of_Water = source_of_Water;
    }
}
