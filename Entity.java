package q3;

import java.util.Date;

    public class Entity {
        private int id;
        private Date createdDate;
        private Date updatedDate;

        public Entity(int id) throws TaxDataException {
            if (id <= 0) {
                throw new TaxDataException("ID must be greater than 0.");
            }
            this.id = id;
            this.createdDate = new Date();
            this.updatedDate = new Date();
        }

        public int getId() {
            return id;
        }

        public Date getCreatedDate() {
            return createdDate;
        }

        public Date getUpdatedDate() {
            return updatedDate;
        }
    }
