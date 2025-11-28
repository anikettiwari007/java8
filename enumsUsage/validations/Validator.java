package enumsUsage.validations;

public enum Validator {
    EMAIL {
        @Override
        public boolean validate(String input) {
            return false;
        }
    },
    PHONE {
        @Override
        public boolean validate(String input) {
            return false;
        }
    },
    ZIP_CODE {
        @Override
        public boolean validate(String input) {
            return false;
        }
    };

    public abstract boolean validate(String input);
}
