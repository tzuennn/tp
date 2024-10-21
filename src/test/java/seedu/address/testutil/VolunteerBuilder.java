package seedu.address.testutil;

import seedu.address.model.volunteer.Date;
import seedu.address.model.volunteer.Email;
import seedu.address.model.volunteer.Name;
import seedu.address.model.volunteer.Phone;
import seedu.address.model.volunteer.Time;
import seedu.address.model.volunteer.UniqueVolunteerList;
import seedu.address.model.volunteer.Volunteer;
import seedu.address.model.volunteer.VolunteerInvolvedInEventPredicate;
import seedu.address.model.util.SampleDataUtil;


import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * A utility class to help with building Volunteer objects.
 */
public class VolunteerBuilder {

    public static final String DEFAULT_NAME = "John Doe";
    public static final String DEFAULT_PHONE = "12345678";
    public static final String DEFAULT_EMAIL = "johndoe@example.com";
    public static final String DEFAULT_DATE = "2024-10-21";
    public static final String DEFAULT_START_TIME = "09:00";
    public static final String DEFAULT_END_TIME = "17:00";

    private Name name;
    private Phone phone;
    private Email email;
    private Date availableDate;
    private Time startTimeAvailability;
    private Time endTimeAvailability;
    private ObservableList<String> involvedIn;

    /**
     * Initializes the VolunteerBuilder with default data.
     */
    public VolunteerBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        availableDate = new Date(DEFAULT_DATE);
        startTimeAvailability = new Time(DEFAULT_START_TIME);
        endTimeAvailability = new Time(DEFAULT_END_TIME);
        involvedIn = FXCollections.observableArrayList();
    }

    /**
     * Initializes the VolunteerBuilder with the data of {@code volunteerToCopy}.
     */
    public VolunteerBuilder(Volunteer volunteerToCopy) {
        name = volunteerToCopy.getName();
        phone = volunteerToCopy.getPhone();
        email = volunteerToCopy.getEmail();
        availableDate = volunteerToCopy.getAvailableDate();
        startTimeAvailability = volunteerToCopy.getStartTimeAvailability();
        endTimeAvailability = volunteerToCopy.getEndTimeAvailability();
        involvedIn = volunteerToCopy.getInvolvedIn();
    }

    /**
     * Sets the {@code Name} of the {@code Volunteer} that we are building.
     */
    public VolunteerBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Volunteer} that we are building.
     */
    public VolunteerBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Volunteer} that we are building.
     */
    public VolunteerBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code Date} of the {@code Volunteer} that we are building.
     */
    public VolunteerBuilder withAvailableDate(String availableDate) {
        this.availableDate = new Date(availableDate);
        return this;
    }

    /**
     * Sets the {@code Time} for the start of availability of the {@code Volunteer} that we are building.
     */
    public VolunteerBuilder withStartTimeAvailability(String startTime) {
        this.startTimeAvailability = new Time(startTime);
        return this;
    }

    /**
     * Sets the {@code Time} for the end of availability of the {@code Volunteer} that we are building.
     */
    public VolunteerBuilder withEndTimeAvailability(String endTime) {
        this.endTimeAvailability = new Time(endTime);
        return this;
    }


    /**
     * Builds the {@code Volunteer} object.
     */
    public Volunteer build() {
        return new Volunteer(name, phone, email, availableDate, startTimeAvailability, endTimeAvailability, involvedIn);
    }
}
