package com.example.pz_17_zlobina_pr_21_101;

public class Emploee {

        private String Year;
        private String MODEL;
        private String MARKA;
        private String SERIA;

        public Emploee() {
        }

        public Emploee(String Year, String MODEL, String MARKA,  String SERIA) {
            this.Year = Year;
            this.MODEL = MODEL;
            this.MARKA = MARKA;
            this.SERIA = SERIA;
        }

        public String getYear() {
            return Year;
        }

        public String getMODEL() {
            return MODEL;
        }

        public String getMARKA() {
            return MARKA;
        }

        public String getSERIA() {
            return SERIA;
        }

        public void getYear(String Year) {
            this.Year = Year;
        }

        public void getMODEL(String MODEL) {
            this.MODEL = MODEL;
        }

        public void getMARKA(String MARKA) {
            this.MARKA = MARKA;
        }

        public void getSERIA(String SERIA) {
            this.SERIA = SERIA;
        }
    }

