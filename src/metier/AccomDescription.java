
package com.koedia.othyssia.channelmanager.adapter.webservice.document.v0_1.schemas;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authentication" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}authentication_type"/>
 *         &lt;element name="Accommodation" maxOccurs="10">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GeneralInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Brand" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Chain" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Category" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}category_code_type" minOccurs="0"/>
 *                             &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AddressComplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="City" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas>city_type">
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ShortDescription" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}description_type" minOccurs="0"/>
 *                             &lt;element name="CurrencyCode" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}currency_code_type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DescriptionInformations" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Descriptions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}description_type" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Facilities" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Facility" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}facility_type" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="facilities_with_program_data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
 *                                     &lt;attribute name="facilities_without_program_data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Locations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Location" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}location_type" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Areas" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Area" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}area_type" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Pictures" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Picture" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}picture_type" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="HostingTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}hosting_types_type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BookingInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EmailForBooking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FaxNumberForBooking" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="indicatif" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BookingMode" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="Default" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}unary_type"/>
 *                                       &lt;element name="Specific">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="by_email" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="by_fax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="InfantAgeUpTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="ChildAgeUpTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="YoungAgeUpTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="RateTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}rate_types_type" minOccurs="0"/>
 *                             &lt;element name="TaxInformation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Taxes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}taxes" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CancelPolicy" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CancellationPolicyRules" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BookingDateConstraint" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;choice>
 *                                                   &lt;sequence>
 *                                                     &lt;element name="CancellationPolicyRule" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded" minOccurs="0"/>
 *                                                   &lt;/sequence>
 *                                                   &lt;element name="CancellationPolicyModelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;/choice>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AmendmentPolicy" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GraduateAmendmentFeeRules" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BookingDateConstraint" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="GraduateAmendmentFee" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PayableBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Commissions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Commission" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CommissionRate" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *                                                         &lt;attribute name="minimum_stay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="taxes_included" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ContractRemarks" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}contract_remarks" minOccurs="0"/>
 *                             &lt;element name="Promotions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Promotion" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Labels" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}labels_type"/>
 *                                                 &lt;element name="RoomTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}room_types_type"/>
 *                                                 &lt;element name="Programs" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}programs_type"/>
 *                                                 &lt;element name="PromotionType">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;choice>
 *                                                           &lt;element name="EarlyBooking" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}early_booking_type"/>
 *                                                           &lt;element name="FreeAdult" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_adult_type"/>
 *                                                           &lt;element name="FreeChild" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_child_type"/>
 *                                                           &lt;element name="FreeNight" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_night_type"/>
 *                                                           &lt;element name="LastMinute" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}last_minute_type"/>
 *                                                           &lt;element name="Miscellaneous" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}miscellaneous_type"/>
 *                                                           &lt;element name="PercentageTrip" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}percentage_trip_type"/>
 *                                                           &lt;element name="ReductionPax" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reduction_pax_type"/>
 *                                                           &lt;element name="Single" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}single_type"/>
 *                                                         &lt;/choice>
 *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                         &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ReservationType" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reservation_type_type"/>
 *                                                 &lt;element name="Concern" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}concern_type"/>
 *                                                 &lt;element name="StayRestrictions" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}stay_restrictions_type" minOccurs="0"/>
 *                                                 &lt;element name="Cumulative" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}cumulative_type" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                               &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="refundable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="data_policy" use="required" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="accom_type" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}accom_type" default="HOTEL" />
 *                 &lt;attribute name="accom_code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="activated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="description_mode" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}description_mode_type" default="creation" />
 *       &lt;attribute name="response_url" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "authentication", "accommodation" })
@XmlRootElement(name = "AccomDescription")
public class AccomDescription {

	@XmlElement(name = "Authentication", required = true)
	protected AuthenticationType authentication;
	@XmlElement(name = "Accommodation", required = true)
	protected List<AccomDescription.Accommodation> accommodation;
	@XmlAttribute(name = "description_mode")
	protected DescriptionModeType descriptionMode;
	@XmlAttribute(name = "response_url", required = true)
	protected String responseUrl;
	@XmlAttribute
	protected Long timestamp;

	/**
	 * Gets the value of the authentication property.
	 * 
	 * @return possible object is {@link AuthenticationType }
	 * 
	 */
	public AuthenticationType getAuthentication() {
		return authentication;
	}

	/**
	 * Sets the value of the authentication property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthenticationType }
	 * 
	 */
	public void setAuthentication(AuthenticationType value) {
		this.authentication = value;
	}

	/**
	 * Gets the value of the accommodation property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the accommodation property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAccommodation().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AccomDescription.Accommodation }
	 * 
	 * 
	 */
	public List<AccomDescription.Accommodation> getAccommodation() {
		if (accommodation == null) {
			accommodation = new ArrayList<AccomDescription.Accommodation>();
		}
		return this.accommodation;
	}

	/**
	 * Gets the value of the descriptionMode property.
	 * 
	 * @return possible object is {@link DescriptionModeType }
	 * 
	 */
	public DescriptionModeType getDescriptionMode() {
		if (descriptionMode == null) {
			return DescriptionModeType.CREATION;
		} else {
			return descriptionMode;
		}
	}

	/**
	 * Sets the value of the descriptionMode property.
	 * 
	 * @param value
	 *            allowed object is {@link DescriptionModeType }
	 * 
	 */
	public void setDescriptionMode(DescriptionModeType value) {
		this.descriptionMode = value;
	}

	/**
	 * Gets the value of the responseUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponseUrl() {
		return responseUrl;
	}

	/**
	 * Sets the value of the responseUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponseUrl(String value) {
		this.responseUrl = value;
	}

	/**
	 * Gets the value of the timestamp property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the timestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setTimestamp(Long value) {
		this.timestamp = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="GeneralInformation" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="Brand" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;simpleContent>
	 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
	 *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                         &lt;/extension>
	 *                       &lt;/simpleContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Chain" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;simpleContent>
	 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
	 *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                         &lt;/extension>
	 *                       &lt;/simpleContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Category" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}category_code_type" minOccurs="0"/>
	 *                   &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="AddressComplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="City" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;simpleContent>
	 *                         &lt;extension base="&lt;http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas>city_type">
	 *                         &lt;/extension>
	 *                       &lt;/simpleContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *                   &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="ShortDescription" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}description_type" minOccurs="0"/>
	 *                   &lt;element name="CurrencyCode" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}currency_code_type" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="DescriptionInformations" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="Descriptions" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Description" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}description_type" maxOccurs="unbounded"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Facilities" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Facility" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}facility_type" maxOccurs="unbounded"/>
	 *                           &lt;/sequence>
	 *                           &lt;attribute name="facilities_with_program_data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
	 *                           &lt;attribute name="facilities_without_program_data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Locations" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Location" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}location_type" maxOccurs="unbounded"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Areas" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Area" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}area_type" maxOccurs="unbounded"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="Pictures" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Picture" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}picture_type" maxOccurs="unbounded"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="HostingTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}hosting_types_type" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="BookingInformation" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="EmailForBooking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="FaxNumberForBooking" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;simpleContent>
	 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
	 *                           &lt;attribute name="indicatif" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *                         &lt;/extension>
	 *                       &lt;/simpleContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="BookingMode" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;choice>
	 *                             &lt;element name="Default" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}unary_type"/>
	 *                             &lt;element name="Specific">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;attribute name="by_email" type="{http://www.w3.org/2001/XMLSchema}boolean" />
	 *                                     &lt;attribute name="by_fax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/choice>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="InfantAgeUpTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *                   &lt;element name="ChildAgeUpTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *                   &lt;element name="YoungAgeUpTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *                   &lt;element name="RateTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}rate_types_type" minOccurs="0"/>
	 *                   &lt;element name="TaxInformation" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Taxes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}taxes" maxOccurs="unbounded" minOccurs="0"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="CancelPolicy" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="CancellationPolicyRules" maxOccurs="unbounded">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="BookingDateConstraint" minOccurs="0">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                               &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                       &lt;choice>
	 *                                         &lt;sequence>
	 *                                           &lt;element name="CancellationPolicyRule" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded" minOccurs="0"/>
	 *                                         &lt;/sequence>
	 *                                         &lt;element name="CancellationPolicyModelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                                       &lt;/choice>
	 *                                     &lt;/sequence>
	 *                                     &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                     &lt;attribute name="data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="AmendmentPolicy" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="GraduateAmendmentFeeRules" maxOccurs="unbounded">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="BookingDateConstraint" minOccurs="0">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                               &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="GraduateAmendmentFee" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded"/>
	 *                                     &lt;/sequence>
	 *                                     &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="PayableBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="Commissions" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Commission" maxOccurs="unbounded">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="CommissionRate" maxOccurs="unbounded">
	 *                                         &lt;complexType>
	 *                                           &lt;simpleContent>
	 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
	 *                                               &lt;attribute name="minimum_stay" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *                                             &lt;/extension>
	 *                                           &lt;/simpleContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                     &lt;/sequence>
	 *                                     &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                     &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                     &lt;attribute name="taxes_included" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="ContractRemarks" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}contract_remarks" minOccurs="0"/>
	 *                   &lt;element name="Promotions" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Promotion" maxOccurs="unbounded">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="Labels" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}labels_type"/>
	 *                                       &lt;element name="RoomTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}room_types_type"/>
	 *                                       &lt;element name="Programs" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}programs_type"/>
	 *                                       &lt;element name="PromotionType">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;choice>
	 *                                                 &lt;element name="EarlyBooking" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}early_booking_type"/>
	 *                                                 &lt;element name="FreeAdult" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_adult_type"/>
	 *                                                 &lt;element name="FreeChild" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_child_type"/>
	 *                                                 &lt;element name="FreeNight" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_night_type"/>
	 *                                                 &lt;element name="LastMinute" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}last_minute_type"/>
	 *                                                 &lt;element name="Miscellaneous" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}miscellaneous_type"/>
	 *                                                 &lt;element name="PercentageTrip" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}percentage_trip_type"/>
	 *                                                 &lt;element name="ReductionPax" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reduction_pax_type"/>
	 *                                                 &lt;element name="Single" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}single_type"/>
	 *                                               &lt;/choice>
	 *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *                                               &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="ReservationType" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reservation_type_type"/>
	 *                                       &lt;element name="Concern" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}concern_type"/>
	 *                                       &lt;element name="StayRestrictions" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}stay_restrictions_type" minOccurs="0"/>
	 *                                       &lt;element name="Cumulative" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}cumulative_type" minOccurs="0"/>
	 *                                     &lt;/sequence>
	 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *                                     &lt;attribute name="refundable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
	 *                                     &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
	 *                                     &lt;attribute name="data_policy" use="required" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *       &lt;attribute name="accom_type" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}accom_type" default="HOTEL" />
	 *       &lt;attribute name="accom_code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *       &lt;attribute name="activated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "generalInformation", "descriptionInformations", "bookingInformation" })
	public static class Accommodation {

		@XmlElement(name = "GeneralInformation")
		protected AccomDescription.Accommodation.GeneralInformation generalInformation;
		@XmlElement(name = "DescriptionInformations")
		protected AccomDescription.Accommodation.DescriptionInformations descriptionInformations;
		@XmlElement(name = "BookingInformation")
		protected AccomDescription.Accommodation.BookingInformation bookingInformation;
		@XmlAttribute(name = "accom_type")
		protected AccomType accomType;
		@XmlAttribute(name = "accom_code", required = true)
		protected String accomCode;
		@XmlAttribute
		protected Boolean activated;

		/**
		 * Gets the value of the generalInformation property.
		 * 
		 * @return possible object is
		 *         {@link AccomDescription.Accommodation.GeneralInformation }
		 * 
		 */
		public AccomDescription.Accommodation.GeneralInformation getGeneralInformation() {
			return generalInformation;
		}

		/**
		 * Sets the value of the generalInformation property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link AccomDescription.Accommodation.GeneralInformation }
		 * 
		 */
		public void setGeneralInformation(AccomDescription.Accommodation.GeneralInformation value) {
			this.generalInformation = value;
		}

		/**
		 * Gets the value of the descriptionInformations property.
		 * 
		 * @return possible object is
		 *         {@link AccomDescription.Accommodation.DescriptionInformations }
		 * 
		 */
		public AccomDescription.Accommodation.DescriptionInformations getDescriptionInformations() {
			return descriptionInformations;
		}

		/**
		 * Sets the value of the descriptionInformations property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link AccomDescription.Accommodation.DescriptionInformations }
		 * 
		 */
		public void setDescriptionInformations(AccomDescription.Accommodation.DescriptionInformations value) {
			this.descriptionInformations = value;
		}

		/**
		 * Gets the value of the bookingInformation property.
		 * 
		 * @return possible object is
		 *         {@link AccomDescription.Accommodation.BookingInformation }
		 * 
		 */
		public AccomDescription.Accommodation.BookingInformation getBookingInformation() {
			return bookingInformation;
		}

		/**
		 * Sets the value of the bookingInformation property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link AccomDescription.Accommodation.BookingInformation }
		 * 
		 */
		public void setBookingInformation(AccomDescription.Accommodation.BookingInformation value) {
			this.bookingInformation = value;
		}

		/**
		 * Gets the value of the accomType property.
		 * 
		 * @return possible object is {@link AccomType }
		 * 
		 */
		public AccomType getAccomType() {
			if (accomType == null) {
				return AccomType.HOTEL;
			} else {
				return accomType;
			}
		}

		/**
		 * Sets the value of the accomType property.
		 * 
		 * @param value
		 *            allowed object is {@link AccomType }
		 * 
		 */
		public void setAccomType(AccomType value) {
			this.accomType = value;
		}

		/**
		 * Gets the value of the accomCode property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAccomCode() {
			return accomCode;
		}

		/**
		 * Sets the value of the accomCode property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAccomCode(String value) {
			this.accomCode = value;
		}

		/**
		 * Gets the value of the activated property.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isActivated() {
			return activated;
		}

		/**
		 * Sets the value of the activated property.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setActivated(Boolean value) {
			this.activated = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="EmailForBooking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="FaxNumberForBooking" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;simpleContent>
		 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
		 *                 &lt;attribute name="indicatif" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
		 *               &lt;/extension>
		 *             &lt;/simpleContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="BookingMode" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;choice>
		 *                   &lt;element name="Default" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}unary_type"/>
		 *                   &lt;element name="Specific">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;attribute name="by_email" type="{http://www.w3.org/2001/XMLSchema}boolean" />
		 *                           &lt;attribute name="by_fax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/choice>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="InfantAgeUpTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
		 *         &lt;element name="ChildAgeUpTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
		 *         &lt;element name="YoungAgeUpTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
		 *         &lt;element name="RateTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}rate_types_type" minOccurs="0"/>
		 *         &lt;element name="TaxInformation" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Taxes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}taxes" maxOccurs="unbounded" minOccurs="0"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="CancelPolicy" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="CancellationPolicyRules" maxOccurs="unbounded">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="BookingDateConstraint" minOccurs="0">
		 *                               &lt;complexType>
		 *                                 &lt;complexContent>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                     &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                                     &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                                   &lt;/restriction>
		 *                                 &lt;/complexContent>
		 *                               &lt;/complexType>
		 *                             &lt;/element>
		 *                             &lt;choice>
		 *                               &lt;sequence>
		 *                                 &lt;element name="CancellationPolicyRule" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded" minOccurs="0"/>
		 *                               &lt;/sequence>
		 *                               &lt;element name="CancellationPolicyModelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *                             &lt;/choice>
		 *                           &lt;/sequence>
		 *                           &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                           &lt;attribute name="data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="AmendmentPolicy" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="GraduateAmendmentFeeRules" maxOccurs="unbounded">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="BookingDateConstraint" minOccurs="0">
		 *                               &lt;complexType>
		 *                                 &lt;complexContent>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                     &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                                     &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                                   &lt;/restriction>
		 *                                 &lt;/complexContent>
		 *                               &lt;/complexType>
		 *                             &lt;/element>
		 *                             &lt;element name="GraduateAmendmentFee" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded"/>
		 *                           &lt;/sequence>
		 *                           &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="PayableBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="Commissions" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Commission" maxOccurs="unbounded">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="CommissionRate" maxOccurs="unbounded">
		 *                               &lt;complexType>
		 *                                 &lt;simpleContent>
		 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
		 *                                     &lt;attribute name="minimum_stay" type="{http://www.w3.org/2001/XMLSchema}int" />
		 *                                   &lt;/extension>
		 *                                 &lt;/simpleContent>
		 *                               &lt;/complexType>
		 *                             &lt;/element>
		 *                           &lt;/sequence>
		 *                           &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                           &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                           &lt;attribute name="taxes_included" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="ContractRemarks" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}contract_remarks" minOccurs="0"/>
		 *         &lt;element name="Promotions" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Promotion" maxOccurs="unbounded">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="Labels" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}labels_type"/>
		 *                             &lt;element name="RoomTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}room_types_type"/>
		 *                             &lt;element name="Programs" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}programs_type"/>
		 *                             &lt;element name="PromotionType">
		 *                               &lt;complexType>
		 *                                 &lt;complexContent>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                     &lt;choice>
		 *                                       &lt;element name="EarlyBooking" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}early_booking_type"/>
		 *                                       &lt;element name="FreeAdult" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_adult_type"/>
		 *                                       &lt;element name="FreeChild" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_child_type"/>
		 *                                       &lt;element name="FreeNight" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_night_type"/>
		 *                                       &lt;element name="LastMinute" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}last_minute_type"/>
		 *                                       &lt;element name="Miscellaneous" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}miscellaneous_type"/>
		 *                                       &lt;element name="PercentageTrip" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}percentage_trip_type"/>
		 *                                       &lt;element name="ReductionPax" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reduction_pax_type"/>
		 *                                       &lt;element name="Single" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}single_type"/>
		 *                                     &lt;/choice>
		 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
		 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                                   &lt;/restriction>
		 *                                 &lt;/complexContent>
		 *                               &lt;/complexType>
		 *                             &lt;/element>
		 *                             &lt;element name="ReservationType" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reservation_type_type"/>
		 *                             &lt;element name="Concern" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}concern_type"/>
		 *                             &lt;element name="StayRestrictions" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}stay_restrictions_type" minOccurs="0"/>
		 *                             &lt;element name="Cumulative" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}cumulative_type" minOccurs="0"/>
		 *                           &lt;/sequence>
		 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
		 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *                           &lt;attribute name="refundable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
		 *                           &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
		 *                           &lt;attribute name="data_policy" use="required" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "emailForBooking", "faxNumberForBooking", "bookingMode", "infantAgeUpTo",
				"childAgeUpTo", "youngAgeUpTo", "rateTypes", "taxInformation", "cancelPolicy", "amendmentPolicy",
				"payableBy", "commissions", "contractRemarks", "promotions" })
		public static class BookingInformation {

			@XmlElement(name = "EmailForBooking")
			protected String emailForBooking;
			@XmlElement(name = "FaxNumberForBooking")
			protected AccomDescription.Accommodation.BookingInformation.FaxNumberForBooking faxNumberForBooking;
			@XmlElement(name = "BookingMode")
			protected AccomDescription.Accommodation.BookingInformation.BookingMode bookingMode;
			@XmlElement(name = "InfantAgeUpTo")
			protected Integer infantAgeUpTo;
			@XmlElement(name = "ChildAgeUpTo")
			protected Integer childAgeUpTo;
			@XmlElement(name = "YoungAgeUpTo")
			protected Integer youngAgeUpTo;
			@XmlElement(name = "RateTypes")
			protected RateTypesType rateTypes;
			@XmlElement(name = "TaxInformation")
			protected AccomDescription.Accommodation.BookingInformation.TaxInformation taxInformation;
			@XmlElement(name = "CancelPolicy")
			protected AccomDescription.Accommodation.BookingInformation.CancelPolicy cancelPolicy;
			@XmlElement(name = "AmendmentPolicy")
			protected AccomDescription.Accommodation.BookingInformation.AmendmentPolicy amendmentPolicy;
			@XmlElement(name = "PayableBy")
			protected String payableBy;
			@XmlElement(name = "Commissions")
			protected AccomDescription.Accommodation.BookingInformation.Commissions commissions;
			@XmlElement(name = "ContractRemarks")
			protected ContractRemarks contractRemarks;
			@XmlElement(name = "Promotions")
			protected AccomDescription.Accommodation.BookingInformation.Promotions promotions;

			/**
			 * Gets the value of the emailForBooking property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEmailForBooking() {
				return emailForBooking;
			}

			/**
			 * Sets the value of the emailForBooking property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEmailForBooking(String value) {
				this.emailForBooking = value;
			}

			/**
			 * Gets the value of the faxNumberForBooking property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.BookingInformation.FaxNumberForBooking }
			 * 
			 */
			public AccomDescription.Accommodation.BookingInformation.FaxNumberForBooking getFaxNumberForBooking() {
				return faxNumberForBooking;
			}

			/**
			 * Sets the value of the faxNumberForBooking property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.BookingInformation.FaxNumberForBooking }
			 * 
			 */
			public void setFaxNumberForBooking(
					AccomDescription.Accommodation.BookingInformation.FaxNumberForBooking value) {
				this.faxNumberForBooking = value;
			}

			/**
			 * Gets the value of the bookingMode property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.BookingInformation.BookingMode }
			 * 
			 */
			public AccomDescription.Accommodation.BookingInformation.BookingMode getBookingMode() {
				return bookingMode;
			}

			/**
			 * Sets the value of the bookingMode property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.BookingInformation.BookingMode }
			 * 
			 */
			public void setBookingMode(AccomDescription.Accommodation.BookingInformation.BookingMode value) {
				this.bookingMode = value;
			}

			/**
			 * Gets the value of the infantAgeUpTo property.
			 * 
			 * @return possible object is {@link Integer }
			 * 
			 */
			public Integer getInfantAgeUpTo() {
				return infantAgeUpTo;
			}

			/**
			 * Sets the value of the infantAgeUpTo property.
			 * 
			 * @param value
			 *            allowed object is {@link Integer }
			 * 
			 */
			public void setInfantAgeUpTo(Integer value) {
				this.infantAgeUpTo = value;
			}

			/**
			 * Gets the value of the childAgeUpTo property.
			 * 
			 * @return possible object is {@link Integer }
			 * 
			 */
			public Integer getChildAgeUpTo() {
				return childAgeUpTo;
			}

			/**
			 * Sets the value of the childAgeUpTo property.
			 * 
			 * @param value
			 *            allowed object is {@link Integer }
			 * 
			 */
			public void setChildAgeUpTo(Integer value) {
				this.childAgeUpTo = value;
			}

			/**
			 * Gets the value of the youngAgeUpTo property.
			 * 
			 * @return possible object is {@link Integer }
			 * 
			 */
			public Integer getYoungAgeUpTo() {
				return youngAgeUpTo;
			}

			/**
			 * Sets the value of the youngAgeUpTo property.
			 * 
			 * @param value
			 *            allowed object is {@link Integer }
			 * 
			 */
			public void setYoungAgeUpTo(Integer value) {
				this.youngAgeUpTo = value;
			}

			/**
			 * Gets the value of the rateTypes property.
			 * 
			 * @return possible object is {@link RateTypesType }
			 * 
			 */
			public RateTypesType getRateTypes() {
				return rateTypes;
			}

			/**
			 * Sets the value of the rateTypes property.
			 * 
			 * @param value
			 *            allowed object is {@link RateTypesType }
			 * 
			 */
			public void setRateTypes(RateTypesType value) {
				this.rateTypes = value;
			}

			/**
			 * Gets the value of the taxInformation property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.BookingInformation.TaxInformation }
			 * 
			 */
			public AccomDescription.Accommodation.BookingInformation.TaxInformation getTaxInformation() {
				return taxInformation;
			}

			/**
			 * Sets the value of the taxInformation property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.BookingInformation.TaxInformation }
			 * 
			 */
			public void setTaxInformation(AccomDescription.Accommodation.BookingInformation.TaxInformation value) {
				this.taxInformation = value;
			}

			/**
			 * Gets the value of the cancelPolicy property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.BookingInformation.CancelPolicy }
			 * 
			 */
			public AccomDescription.Accommodation.BookingInformation.CancelPolicy getCancelPolicy() {
				return cancelPolicy;
			}

			/**
			 * Sets the value of the cancelPolicy property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.BookingInformation.CancelPolicy }
			 * 
			 */
			public void setCancelPolicy(AccomDescription.Accommodation.BookingInformation.CancelPolicy value) {
				this.cancelPolicy = value;
			}

			/**
			 * Gets the value of the amendmentPolicy property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.BookingInformation.AmendmentPolicy }
			 * 
			 */
			public AccomDescription.Accommodation.BookingInformation.AmendmentPolicy getAmendmentPolicy() {
				return amendmentPolicy;
			}

			/**
			 * Sets the value of the amendmentPolicy property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.BookingInformation.AmendmentPolicy }
			 * 
			 */
			public void setAmendmentPolicy(AccomDescription.Accommodation.BookingInformation.AmendmentPolicy value) {
				this.amendmentPolicy = value;
			}

			/**
			 * Gets the value of the payableBy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPayableBy() {
				return payableBy;
			}

			/**
			 * Sets the value of the payableBy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPayableBy(String value) {
				this.payableBy = value;
			}

			/**
			 * Gets the value of the commissions property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.BookingInformation.Commissions }
			 * 
			 */
			public AccomDescription.Accommodation.BookingInformation.Commissions getCommissions() {
				return commissions;
			}

			/**
			 * Sets the value of the commissions property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.BookingInformation.Commissions }
			 * 
			 */
			public void setCommissions(AccomDescription.Accommodation.BookingInformation.Commissions value) {
				this.commissions = value;
			}

			/**
			 * Gets the value of the contractRemarks property.
			 * 
			 * @return possible object is {@link ContractRemarks }
			 * 
			 */
			public ContractRemarks getContractRemarks() {
				return contractRemarks;
			}

			/**
			 * Sets the value of the contractRemarks property.
			 * 
			 * @param value
			 *            allowed object is {@link ContractRemarks }
			 * 
			 */
			public void setContractRemarks(ContractRemarks value) {
				this.contractRemarks = value;
			}

			/**
			 * Gets the value of the promotions property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.BookingInformation.Promotions }
			 * 
			 */
			public AccomDescription.Accommodation.BookingInformation.Promotions getPromotions() {
				return promotions;
			}

			/**
			 * Sets the value of the promotions property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.BookingInformation.Promotions }
			 * 
			 */
			public void setPromotions(AccomDescription.Accommodation.BookingInformation.Promotions value) {
				this.promotions = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="GraduateAmendmentFeeRules" maxOccurs="unbounded">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="BookingDateConstraint" minOccurs="0">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *                           &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;element name="GraduateAmendmentFee" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded"/>
			 *                 &lt;/sequence>
			 *                 &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "graduateAmendmentFeeRules" })
			public static class AmendmentPolicy {

				@XmlElement(name = "GraduateAmendmentFeeRules", required = true)
				protected List<AccomDescription.Accommodation.BookingInformation.AmendmentPolicy.GraduateAmendmentFeeRules> graduateAmendmentFeeRules;

				/**
				 * Gets the value of the graduateAmendmentFeeRules property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the
				 * graduateAmendmentFeeRules property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getGraduateAmendmentFeeRules().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link AccomDescription.Accommodation.BookingInformation.AmendmentPolicy.GraduateAmendmentFeeRules }
				 * 
				 * 
				 */
				public List<AccomDescription.Accommodation.BookingInformation.AmendmentPolicy.GraduateAmendmentFeeRules> getGraduateAmendmentFeeRules() {
					if (graduateAmendmentFeeRules == null) {
						graduateAmendmentFeeRules = new ArrayList<AccomDescription.Accommodation.BookingInformation.AmendmentPolicy.GraduateAmendmentFeeRules>();
					}
					return this.graduateAmendmentFeeRules;
				}

				/**
				 * <p>
				 * Java class for anonymous complex type.
				 * 
				 * <p>
				 * The following schema fragment specifies the expected content
				 * contained within this class.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="BookingDateConstraint" minOccurs="0">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *                 &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;element name="GraduateAmendmentFee" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded"/>
				 *       &lt;/sequence>
				 *       &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "bookingDateConstraint", "graduateAmendmentFee" })
				public static class GraduateAmendmentFeeRules {

					@XmlElement(name = "BookingDateConstraint")
					protected AccomDescription.Accommodation.BookingInformation.AmendmentPolicy.GraduateAmendmentFeeRules.BookingDateConstraint bookingDateConstraint;
					@XmlElement(name = "GraduateAmendmentFee", required = true)
					protected List<GraduateFeeType> graduateAmendmentFee;
					@XmlAttribute(name = "rate_type_code")
					protected String rateTypeCode;

					/**
					 * Gets the value of the bookingDateConstraint property.
					 * 
					 * @return possible object is
					 *         {@link AccomDescription.Accommodation.BookingInformation.AmendmentPolicy.GraduateAmendmentFeeRules.BookingDateConstraint }
					 * 
					 */
					public AccomDescription.Accommodation.BookingInformation.AmendmentPolicy.GraduateAmendmentFeeRules.BookingDateConstraint getBookingDateConstraint() {
						return bookingDateConstraint;
					}

					/**
					 * Sets the value of the bookingDateConstraint property.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link AccomDescription.Accommodation.BookingInformation.AmendmentPolicy.GraduateAmendmentFeeRules.BookingDateConstraint }
					 * 
					 */
					public void setBookingDateConstraint(
							AccomDescription.Accommodation.BookingInformation.AmendmentPolicy.GraduateAmendmentFeeRules.BookingDateConstraint value) {
						this.bookingDateConstraint = value;
					}

					/**
					 * Gets the value of the graduateAmendmentFee property.
					 * 
					 * <p>
					 * This accessor method returns a reference to the live
					 * list, not a snapshot. Therefore any modification you make
					 * to the returned list will be present inside the JAXB
					 * object. This is why there is not a <CODE>set</CODE>
					 * method for the graduateAmendmentFee property.
					 * 
					 * <p>
					 * For example, to add a new item, do as follows:
					 * 
					 * <pre>
					 * getGraduateAmendmentFee().add(newItem);
					 * </pre>
					 * 
					 * 
					 * <p>
					 * Objects of the following type(s) are allowed in the list
					 * {@link GraduateFeeType }
					 * 
					 * 
					 */
					public List<GraduateFeeType> getGraduateAmendmentFee() {
						if (graduateAmendmentFee == null) {
							graduateAmendmentFee = new ArrayList<GraduateFeeType>();
						}
						return this.graduateAmendmentFee;
					}

					/**
					 * Gets the value of the rateTypeCode property.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getRateTypeCode() {
						return rateTypeCode;
					}

					/**
					 * Sets the value of the rateTypeCode property.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setRateTypeCode(String value) {
						this.rateTypeCode = value;
					}

					/**
					 * <p>
					 * Java class for anonymous complex type.
					 * 
					 * <p>
					 * The following schema fragment specifies the expected
					 * content contained within this class.
					 * 
					 * <pre>
					 * &lt;complexType>
					 *   &lt;complexContent>
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
					 *       &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
					 *       &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
					 *     &lt;/restriction>
					 *   &lt;/complexContent>
					 * &lt;/complexType>
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "")
					public static class BookingDateConstraint {

						@XmlAttribute(name = "from_date", required = true)
						protected String fromDate;
						@XmlAttribute(name = "to_date", required = true)
						protected String toDate;

						/**
						 * Gets the value of the fromDate property.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getFromDate() {
							return fromDate;
						}

						/**
						 * Sets the value of the fromDate property.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setFromDate(String value) {
							this.fromDate = value;
						}

						/**
						 * Gets the value of the toDate property.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getToDate() {
							return toDate;
						}

						/**
						 * Sets the value of the toDate property.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setToDate(String value) {
							this.toDate = value;
						}

					}

				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;choice>
			 *         &lt;element name="Default" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}unary_type"/>
			 *         &lt;element name="Specific">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;attribute name="by_email" type="{http://www.w3.org/2001/XMLSchema}boolean" />
			 *                 &lt;attribute name="by_fax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/choice>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "_default", "specific" })
			public static class BookingMode {

				@XmlElement(name = "Default")
				protected UnaryType _default;
				@XmlElement(name = "Specific")
				protected AccomDescription.Accommodation.BookingInformation.BookingMode.Specific specific;

				/**
				 * Gets the value of the default property.
				 * 
				 * @return possible object is {@link UnaryType }
				 * 
				 */
				public UnaryType getDefault() {
					return _default;
				}

				/**
				 * Sets the value of the default property.
				 * 
				 * @param value
				 *            allowed object is {@link UnaryType }
				 * 
				 */
				public void setDefault(UnaryType value) {
					this._default = value;
				}

				/**
				 * Gets the value of the specific property.
				 * 
				 * @return possible object is
				 *         {@link AccomDescription.Accommodation.BookingInformation.BookingMode.Specific }
				 * 
				 */
				public AccomDescription.Accommodation.BookingInformation.BookingMode.Specific getSpecific() {
					return specific;
				}

				/**
				 * Sets the value of the specific property.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link AccomDescription.Accommodation.BookingInformation.BookingMode.Specific }
				 * 
				 */
				public void setSpecific(AccomDescription.Accommodation.BookingInformation.BookingMode.Specific value) {
					this.specific = value;
				}

				/**
				 * <p>
				 * Java class for anonymous complex type.
				 * 
				 * <p>
				 * The following schema fragment specifies the expected content
				 * contained within this class.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;attribute name="by_email" type="{http://www.w3.org/2001/XMLSchema}boolean" />
				 *       &lt;attribute name="by_fax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "")
				public static class Specific {

					@XmlAttribute(name = "by_email")
					protected Boolean byEmail;
					@XmlAttribute(name = "by_fax")
					protected Boolean byFax;

					/**
					 * Gets the value of the byEmail property.
					 * 
					 * @return possible object is {@link Boolean }
					 * 
					 */
					public Boolean isByEmail() {
						return byEmail;
					}

					/**
					 * Sets the value of the byEmail property.
					 * 
					 * @param value
					 *            allowed object is {@link Boolean }
					 * 
					 */
					public void setByEmail(Boolean value) {
						this.byEmail = value;
					}

					/**
					 * Gets the value of the byFax property.
					 * 
					 * @return possible object is {@link Boolean }
					 * 
					 */
					public Boolean isByFax() {
						return byFax;
					}

					/**
					 * Sets the value of the byFax property.
					 * 
					 * @param value
					 *            allowed object is {@link Boolean }
					 * 
					 */
					public void setByFax(Boolean value) {
						this.byFax = value;
					}

				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="CancellationPolicyRules" maxOccurs="unbounded">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="BookingDateConstraint" minOccurs="0">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *                           &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;choice>
			 *                     &lt;sequence>
			 *                       &lt;element name="CancellationPolicyRule" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded" minOccurs="0"/>
			 *                     &lt;/sequence>
			 *                     &lt;element name="CancellationPolicyModelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
			 *                   &lt;/choice>
			 *                 &lt;/sequence>
			 *                 &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *                 &lt;attribute name="data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "cancellationPolicyRules" })
			public static class CancelPolicy {

				@XmlElement(name = "CancellationPolicyRules", required = true)
				protected List<AccomDescription.Accommodation.BookingInformation.CancelPolicy.CancellationPolicyRules> cancellationPolicyRules;

				/**
				 * Gets the value of the cancellationPolicyRules property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the
				 * cancellationPolicyRules property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getCancellationPolicyRules().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link AccomDescription.Accommodation.BookingInformation.CancelPolicy.CancellationPolicyRules }
				 * 
				 * 
				 */
				public List<AccomDescription.Accommodation.BookingInformation.CancelPolicy.CancellationPolicyRules> getCancellationPolicyRules() {
					if (cancellationPolicyRules == null) {
						cancellationPolicyRules = new ArrayList<AccomDescription.Accommodation.BookingInformation.CancelPolicy.CancellationPolicyRules>();
					}
					return this.cancellationPolicyRules;
				}

				/**
				 * <p>
				 * Java class for anonymous complex type.
				 * 
				 * <p>
				 * The following schema fragment specifies the expected content
				 * contained within this class.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="BookingDateConstraint" minOccurs="0">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *                 &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;choice>
				 *           &lt;sequence>
				 *             &lt;element name="CancellationPolicyRule" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}graduate_fee_type" maxOccurs="unbounded" minOccurs="0"/>
				 *           &lt;/sequence>
				 *           &lt;element name="CancellationPolicyModelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
				 *         &lt;/choice>
				 *       &lt;/sequence>
				 *       &lt;attribute name="rate_type_code" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *       &lt;attribute name="data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "bookingDateConstraint", "cancellationPolicyRule",
						"cancellationPolicyModelCode" })
				public static class CancellationPolicyRules {

					@XmlElement(name = "BookingDateConstraint")
					protected AccomDescription.Accommodation.BookingInformation.CancelPolicy.CancellationPolicyRules.BookingDateConstraint bookingDateConstraint;
					@XmlElement(name = "CancellationPolicyRule")
					protected List<GraduateFeeType> cancellationPolicyRule;
					@XmlElement(name = "CancellationPolicyModelCode")
					protected String cancellationPolicyModelCode;
					@XmlAttribute(name = "rate_type_code")
					protected String rateTypeCode;
					@XmlAttribute(name = "data_policy")
					protected DataPolicyType dataPolicy;

					/**
					 * Gets the value of the bookingDateConstraint property.
					 * 
					 * @return possible object is
					 *         {@link AccomDescription.Accommodation.BookingInformation.CancelPolicy.CancellationPolicyRules.BookingDateConstraint }
					 * 
					 */
					public AccomDescription.Accommodation.BookingInformation.CancelPolicy.CancellationPolicyRules.BookingDateConstraint getBookingDateConstraint() {
						return bookingDateConstraint;
					}

					/**
					 * Sets the value of the bookingDateConstraint property.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link AccomDescription.Accommodation.BookingInformation.CancelPolicy.CancellationPolicyRules.BookingDateConstraint }
					 * 
					 */
					public void setBookingDateConstraint(
							AccomDescription.Accommodation.BookingInformation.CancelPolicy.CancellationPolicyRules.BookingDateConstraint value) {
						this.bookingDateConstraint = value;
					}

					/**
					 * Gets the value of the cancellationPolicyRule property.
					 * 
					 * <p>
					 * This accessor method returns a reference to the live
					 * list, not a snapshot. Therefore any modification you make
					 * to the returned list will be present inside the JAXB
					 * object. This is why there is not a <CODE>set</CODE>
					 * method for the cancellationPolicyRule property.
					 * 
					 * <p>
					 * For example, to add a new item, do as follows:
					 * 
					 * <pre>
					 * getCancellationPolicyRule().add(newItem);
					 * </pre>
					 * 
					 * 
					 * <p>
					 * Objects of the following type(s) are allowed in the list
					 * {@link GraduateFeeType }
					 * 
					 * 
					 */
					public List<GraduateFeeType> getCancellationPolicyRule() {
						if (cancellationPolicyRule == null) {
							cancellationPolicyRule = new ArrayList<GraduateFeeType>();
						}
						return this.cancellationPolicyRule;
					}

					/**
					 * Gets the value of the cancellationPolicyModelCode
					 * property.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getCancellationPolicyModelCode() {
						return cancellationPolicyModelCode;
					}

					/**
					 * Sets the value of the cancellationPolicyModelCode
					 * property.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setCancellationPolicyModelCode(String value) {
						this.cancellationPolicyModelCode = value;
					}

					/**
					 * Gets the value of the rateTypeCode property.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getRateTypeCode() {
						return rateTypeCode;
					}

					/**
					 * Sets the value of the rateTypeCode property.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setRateTypeCode(String value) {
						this.rateTypeCode = value;
					}

					/**
					 * Gets the value of the dataPolicy property.
					 * 
					 * @return possible object is {@link DataPolicyType }
					 * 
					 */
					public DataPolicyType getDataPolicy() {
						return dataPolicy;
					}

					/**
					 * Sets the value of the dataPolicy property.
					 * 
					 * @param value
					 *            allowed object is {@link DataPolicyType }
					 * 
					 */
					public void setDataPolicy(DataPolicyType value) {
						this.dataPolicy = value;
					}

					/**
					 * <p>
					 * Java class for anonymous complex type.
					 * 
					 * <p>
					 * The following schema fragment specifies the expected
					 * content contained within this class.
					 * 
					 * <pre>
					 * &lt;complexType>
					 *   &lt;complexContent>
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
					 *       &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
					 *       &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
					 *     &lt;/restriction>
					 *   &lt;/complexContent>
					 * &lt;/complexType>
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "")
					public static class BookingDateConstraint {

						@XmlAttribute(name = "from_date", required = true)
						protected String fromDate;
						@XmlAttribute(name = "to_date", required = true)
						protected String toDate;

						/**
						 * Gets the value of the fromDate property.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getFromDate() {
							return fromDate;
						}

						/**
						 * Sets the value of the fromDate property.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setFromDate(String value) {
							this.fromDate = value;
						}

						/**
						 * Gets the value of the toDate property.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getToDate() {
							return toDate;
						}

						/**
						 * Sets the value of the toDate property.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setToDate(String value) {
							this.toDate = value;
						}

					}

				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Commission" maxOccurs="unbounded">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="CommissionRate" maxOccurs="unbounded">
			 *                     &lt;complexType>
			 *                       &lt;simpleContent>
			 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
			 *                           &lt;attribute name="minimum_stay" type="{http://www.w3.org/2001/XMLSchema}int" />
			 *                         &lt;/extension>
			 *                       &lt;/simpleContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                 &lt;/sequence>
			 *                 &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *                 &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *                 &lt;attribute name="taxes_included" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "commission" })
			public static class Commissions {

				@XmlElement(name = "Commission", required = true)
				protected List<AccomDescription.Accommodation.BookingInformation.Commissions.Commission> commission;

				/**
				 * Gets the value of the commission property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the commission
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getCommission().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link AccomDescription.Accommodation.BookingInformation.Commissions.Commission }
				 * 
				 * 
				 */
				public List<AccomDescription.Accommodation.BookingInformation.Commissions.Commission> getCommission() {
					if (commission == null) {
						commission = new ArrayList<AccomDescription.Accommodation.BookingInformation.Commissions.Commission>();
					}
					return this.commission;
				}

				/**
				 * <p>
				 * Java class for anonymous complex type.
				 * 
				 * <p>
				 * The following schema fragment specifies the expected content
				 * contained within this class.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="CommissionRate" maxOccurs="unbounded">
				 *           &lt;complexType>
				 *             &lt;simpleContent>
				 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
				 *                 &lt;attribute name="minimum_stay" type="{http://www.w3.org/2001/XMLSchema}int" />
				 *               &lt;/extension>
				 *             &lt;/simpleContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *       &lt;/sequence>
				 *       &lt;attribute name="from_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *       &lt;attribute name="to_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *       &lt;attribute name="taxes_included" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "commissionRate" })
				public static class Commission {

					@XmlElement(name = "CommissionRate", required = true)
					protected List<AccomDescription.Accommodation.BookingInformation.Commissions.Commission.CommissionRate> commissionRate;
					@XmlAttribute(name = "from_date", required = true)
					protected String fromDate;
					@XmlAttribute(name = "to_date", required = true)
					protected String toDate;
					@XmlAttribute(name = "taxes_included", required = true)
					protected boolean taxesIncluded;

					/**
					 * Gets the value of the commissionRate property.
					 * 
					 * <p>
					 * This accessor method returns a reference to the live
					 * list, not a snapshot. Therefore any modification you make
					 * to the returned list will be present inside the JAXB
					 * object. This is why there is not a <CODE>set</CODE>
					 * method for the commissionRate property.
					 * 
					 * <p>
					 * For example, to add a new item, do as follows:
					 * 
					 * <pre>
					 * getCommissionRate().add(newItem);
					 * </pre>
					 * 
					 * 
					 * <p>
					 * Objects of the following type(s) are allowed in the list
					 * {@link AccomDescription.Accommodation.BookingInformation.Commissions.Commission.CommissionRate }
					 * 
					 * 
					 */
					public List<AccomDescription.Accommodation.BookingInformation.Commissions.Commission.CommissionRate> getCommissionRate() {
						if (commissionRate == null) {
							commissionRate = new ArrayList<AccomDescription.Accommodation.BookingInformation.Commissions.Commission.CommissionRate>();
						}
						return this.commissionRate;
					}

					/**
					 * Gets the value of the fromDate property.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getFromDate() {
						return fromDate;
					}

					/**
					 * Sets the value of the fromDate property.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setFromDate(String value) {
						this.fromDate = value;
					}

					/**
					 * Gets the value of the toDate property.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getToDate() {
						return toDate;
					}

					/**
					 * Sets the value of the toDate property.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setToDate(String value) {
						this.toDate = value;
					}

					/**
					 * Gets the value of the taxesIncluded property.
					 * 
					 */
					public boolean isTaxesIncluded() {
						return taxesIncluded;
					}

					/**
					 * Sets the value of the taxesIncluded property.
					 * 
					 */
					public void setTaxesIncluded(boolean value) {
						this.taxesIncluded = value;
					}

					/**
					 * <p>
					 * Java class for anonymous complex type.
					 * 
					 * <p>
					 * The following schema fragment specifies the expected
					 * content contained within this class.
					 * 
					 * <pre>
					 * &lt;complexType>
					 *   &lt;simpleContent>
					 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
					 *       &lt;attribute name="minimum_stay" type="{http://www.w3.org/2001/XMLSchema}int" />
					 *     &lt;/extension>
					 *   &lt;/simpleContent>
					 * &lt;/complexType>
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "value" })
					public static class CommissionRate {

						@XmlValue
						protected double value;
						@XmlAttribute(name = "minimum_stay")
						protected Integer minimumStay;

						/**
						 * Gets the value of the value property.
						 * 
						 */
						public double getValue() {
							return value;
						}

						/**
						 * Sets the value of the value property.
						 * 
						 */
						public void setValue(double value) {
							this.value = value;
						}

						/**
						 * Gets the value of the minimumStay property.
						 * 
						 * @return possible object is {@link Integer }
						 * 
						 */
						public Integer getMinimumStay() {
							return minimumStay;
						}

						/**
						 * Sets the value of the minimumStay property.
						 * 
						 * @param value
						 *            allowed object is {@link Integer }
						 * 
						 */
						public void setMinimumStay(Integer value) {
							this.minimumStay = value;
						}

					}

				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;simpleContent>
			 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
			 *       &lt;attribute name="indicatif" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
			 *     &lt;/extension>
			 *   &lt;/simpleContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "value" })
			public static class FaxNumberForBooking {

				@XmlValue
				protected String value;
				@XmlAttribute(required = true)
				protected int indicatif;

				/**
				 * Gets the value of the value property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getValue() {
					return value;
				}

				/**
				 * Sets the value of the value property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setValue(String value) {
					this.value = value;
				}

				/**
				 * Gets the value of the indicatif property.
				 * 
				 */
				public int getIndicatif() {
					return indicatif;
				}

				/**
				 * Sets the value of the indicatif property.
				 * 
				 */
				public void setIndicatif(int value) {
					this.indicatif = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Promotion" maxOccurs="unbounded">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="Labels" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}labels_type"/>
			 *                   &lt;element name="RoomTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}room_types_type"/>
			 *                   &lt;element name="Programs" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}programs_type"/>
			 *                   &lt;element name="PromotionType">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;choice>
			 *                             &lt;element name="EarlyBooking" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}early_booking_type"/>
			 *                             &lt;element name="FreeAdult" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_adult_type"/>
			 *                             &lt;element name="FreeChild" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_child_type"/>
			 *                             &lt;element name="FreeNight" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_night_type"/>
			 *                             &lt;element name="LastMinute" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}last_minute_type"/>
			 *                             &lt;element name="Miscellaneous" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}miscellaneous_type"/>
			 *                             &lt;element name="PercentageTrip" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}percentage_trip_type"/>
			 *                             &lt;element name="ReductionPax" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reduction_pax_type"/>
			 *                             &lt;element name="Single" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}single_type"/>
			 *                           &lt;/choice>
			 *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
			 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;element name="ReservationType" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reservation_type_type"/>
			 *                   &lt;element name="Concern" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}concern_type"/>
			 *                   &lt;element name="StayRestrictions" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}stay_restrictions_type" minOccurs="0"/>
			 *                   &lt;element name="Cumulative" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}cumulative_type" minOccurs="0"/>
			 *                 &lt;/sequence>
			 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
			 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *                 &lt;attribute name="refundable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
			 *                 &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
			 *                 &lt;attribute name="data_policy" use="required" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "promotion" })
			public static class Promotions {

				@XmlElement(name = "Promotion", required = true)
				protected List<AccomDescription.Accommodation.BookingInformation.Promotions.Promotion> promotion;

				/**
				 * Gets the value of the promotion property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the promotion
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getPromotion().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link AccomDescription.Accommodation.BookingInformation.Promotions.Promotion }
				 * 
				 * 
				 */
				public List<AccomDescription.Accommodation.BookingInformation.Promotions.Promotion> getPromotion() {
					if (promotion == null) {
						promotion = new ArrayList<AccomDescription.Accommodation.BookingInformation.Promotions.Promotion>();
					}
					return this.promotion;
				}

				/**
				 * <p>
				 * Java class for anonymous complex type.
				 * 
				 * <p>
				 * The following schema fragment specifies the expected content
				 * contained within this class.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="Labels" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}labels_type"/>
				 *         &lt;element name="RoomTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}room_types_type"/>
				 *         &lt;element name="Programs" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}programs_type"/>
				 *         &lt;element name="PromotionType">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;choice>
				 *                   &lt;element name="EarlyBooking" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}early_booking_type"/>
				 *                   &lt;element name="FreeAdult" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_adult_type"/>
				 *                   &lt;element name="FreeChild" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_child_type"/>
				 *                   &lt;element name="FreeNight" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_night_type"/>
				 *                   &lt;element name="LastMinute" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}last_minute_type"/>
				 *                   &lt;element name="Miscellaneous" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}miscellaneous_type"/>
				 *                   &lt;element name="PercentageTrip" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}percentage_trip_type"/>
				 *                   &lt;element name="ReductionPax" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reduction_pax_type"/>
				 *                   &lt;element name="Single" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}single_type"/>
				 *                 &lt;/choice>
				 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
				 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;element name="ReservationType" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reservation_type_type"/>
				 *         &lt;element name="Concern" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}concern_type"/>
				 *         &lt;element name="StayRestrictions" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}stay_restrictions_type" minOccurs="0"/>
				 *         &lt;element name="Cumulative" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}cumulative_type" minOccurs="0"/>
				 *       &lt;/sequence>
				 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
				 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
				 *       &lt;attribute name="refundable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
				 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
				 *       &lt;attribute name="data_policy" use="required" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "labels", "roomTypes", "programs", "promotionType", "reservationType",
						"concern", "stayRestrictions", "cumulative" })
				public static class Promotion {

					@XmlElement(name = "Labels", required = true)
					protected LabelsType labels;
					@XmlElement(name = "RoomTypes", required = true)
					protected RoomTypesType roomTypes;
					@XmlElement(name = "Programs", required = true)
					protected ProgramsType programs;
					@XmlElement(name = "PromotionType", required = true)
					protected AccomDescription.Accommodation.BookingInformation.Promotions.Promotion.PromotionType promotionType;
					@XmlElement(name = "ReservationType", required = true)
					protected ReservationTypeType reservationType;
					@XmlElement(name = "Concern", required = true)
					protected ConcernType concern;
					@XmlElement(name = "StayRestrictions")
					protected StayRestrictionsType stayRestrictions;
					@XmlElement(name = "Cumulative")
					protected CumulativeType cumulative;
					@XmlAttribute
					protected Integer id;
					@XmlAttribute(required = true)
					protected String code;
					@XmlAttribute(required = true)
					protected boolean refundable;
					@XmlAttribute
					protected Boolean optional;
					@XmlAttribute(name = "data_policy", required = true)
					protected DataPolicyType dataPolicy;

					/**
					 * Gets the value of the labels property.
					 * 
					 * @return possible object is {@link LabelsType }
					 * 
					 */
					public LabelsType getLabels() {
						return labels;
					}

					/**
					 * Sets the value of the labels property.
					 * 
					 * @param value
					 *            allowed object is {@link LabelsType }
					 * 
					 */
					public void setLabels(LabelsType value) {
						this.labels = value;
					}

					/**
					 * Gets the value of the roomTypes property.
					 * 
					 * @return possible object is {@link RoomTypesType }
					 * 
					 */
					public RoomTypesType getRoomTypes() {
						return roomTypes;
					}

					/**
					 * Sets the value of the roomTypes property.
					 * 
					 * @param value
					 *            allowed object is {@link RoomTypesType }
					 * 
					 */
					public void setRoomTypes(RoomTypesType value) {
						this.roomTypes = value;
					}

					/**
					 * Gets the value of the programs property.
					 * 
					 * @return possible object is {@link ProgramsType }
					 * 
					 */
					public ProgramsType getPrograms() {
						return programs;
					}

					/**
					 * Sets the value of the programs property.
					 * 
					 * @param value
					 *            allowed object is {@link ProgramsType }
					 * 
					 */
					public void setPrograms(ProgramsType value) {
						this.programs = value;
					}

					/**
					 * Gets the value of the promotionType property.
					 * 
					 * @return possible object is
					 *         {@link AccomDescription.Accommodation.BookingInformation.Promotions.Promotion.PromotionType }
					 * 
					 */
					public AccomDescription.Accommodation.BookingInformation.Promotions.Promotion.PromotionType getPromotionType() {
						return promotionType;
					}

					/**
					 * Sets the value of the promotionType property.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link AccomDescription.Accommodation.BookingInformation.Promotions.Promotion.PromotionType }
					 * 
					 */
					public void setPromotionType(
							AccomDescription.Accommodation.BookingInformation.Promotions.Promotion.PromotionType value) {
						this.promotionType = value;
					}

					/**
					 * Gets the value of the reservationType property.
					 * 
					 * @return possible object is {@link ReservationTypeType }
					 * 
					 */
					public ReservationTypeType getReservationType() {
						return reservationType;
					}

					/**
					 * Sets the value of the reservationType property.
					 * 
					 * @param value
					 *            allowed object is {@link ReservationTypeType }
					 * 
					 */
					public void setReservationType(ReservationTypeType value) {
						this.reservationType = value;
					}

					/**
					 * Gets the value of the concern property.
					 * 
					 * @return possible object is {@link ConcernType }
					 * 
					 */
					public ConcernType getConcern() {
						return concern;
					}

					/**
					 * Sets the value of the concern property.
					 * 
					 * @param value
					 *            allowed object is {@link ConcernType }
					 * 
					 */
					public void setConcern(ConcernType value) {
						this.concern = value;
					}

					/**
					 * Gets the value of the stayRestrictions property.
					 * 
					 * @return possible object is {@link StayRestrictionsType }
					 * 
					 */
					public StayRestrictionsType getStayRestrictions() {
						return stayRestrictions;
					}

					/**
					 * Sets the value of the stayRestrictions property.
					 * 
					 * @param value
					 *            allowed object is {@link StayRestrictionsType
					 *            }
					 * 
					 */
					public void setStayRestrictions(StayRestrictionsType value) {
						this.stayRestrictions = value;
					}

					/**
					 * Gets the value of the cumulative property.
					 * 
					 * @return possible object is {@link CumulativeType }
					 * 
					 */
					public CumulativeType getCumulative() {
						return cumulative;
					}

					/**
					 * Sets the value of the cumulative property.
					 * 
					 * @param value
					 *            allowed object is {@link CumulativeType }
					 * 
					 */
					public void setCumulative(CumulativeType value) {
						this.cumulative = value;
					}

					/**
					 * Gets the value of the id property.
					 * 
					 * @return possible object is {@link Integer }
					 * 
					 */
					public Integer getId() {
						return id;
					}

					/**
					 * Sets the value of the id property.
					 * 
					 * @param value
					 *            allowed object is {@link Integer }
					 * 
					 */
					public void setId(Integer value) {
						this.id = value;
					}

					/**
					 * Gets the value of the code property.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getCode() {
						return code;
					}

					/**
					 * Sets the value of the code property.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setCode(String value) {
						this.code = value;
					}

					/**
					 * Gets the value of the refundable property.
					 * 
					 */
					public boolean isRefundable() {
						return refundable;
					}

					/**
					 * Sets the value of the refundable property.
					 * 
					 */
					public void setRefundable(boolean value) {
						this.refundable = value;
					}

					/**
					 * Gets the value of the optional property.
					 * 
					 * @return possible object is {@link Boolean }
					 * 
					 */
					public Boolean isOptional() {
						return optional;
					}

					/**
					 * Sets the value of the optional property.
					 * 
					 * @param value
					 *            allowed object is {@link Boolean }
					 * 
					 */
					public void setOptional(Boolean value) {
						this.optional = value;
					}

					/**
					 * Gets the value of the dataPolicy property.
					 * 
					 * @return possible object is {@link DataPolicyType }
					 * 
					 */
					public DataPolicyType getDataPolicy() {
						return dataPolicy;
					}

					/**
					 * Sets the value of the dataPolicy property.
					 * 
					 * @param value
					 *            allowed object is {@link DataPolicyType }
					 * 
					 */
					public void setDataPolicy(DataPolicyType value) {
						this.dataPolicy = value;
					}

					/**
					 * <p>
					 * Java class for anonymous complex type.
					 * 
					 * <p>
					 * The following schema fragment specifies the expected
					 * content contained within this class.
					 * 
					 * <pre>
					 * &lt;complexType>
					 *   &lt;complexContent>
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
					 *       &lt;choice>
					 *         &lt;element name="EarlyBooking" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}early_booking_type"/>
					 *         &lt;element name="FreeAdult" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_adult_type"/>
					 *         &lt;element name="FreeChild" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_child_type"/>
					 *         &lt;element name="FreeNight" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}free_night_type"/>
					 *         &lt;element name="LastMinute" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}last_minute_type"/>
					 *         &lt;element name="Miscellaneous" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}miscellaneous_type"/>
					 *         &lt;element name="PercentageTrip" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}percentage_trip_type"/>
					 *         &lt;element name="ReductionPax" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}reduction_pax_type"/>
					 *         &lt;element name="Single" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}single_type"/>
					 *       &lt;/choice>
					 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
					 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
					 *     &lt;/restriction>
					 *   &lt;/complexContent>
					 * &lt;/complexType>
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "earlyBooking", "freeAdult", "freeChild", "freeNight",
							"lastMinute", "miscellaneous", "percentageTrip", "reductionPax", "single" })
					public static class PromotionType {

						@XmlElement(name = "EarlyBooking")
						protected EarlyBookingType earlyBooking;
						@XmlElement(name = "FreeAdult")
						protected FreeAdultType freeAdult;
						@XmlElement(name = "FreeChild")
						protected FreeChildType freeChild;
						@XmlElement(name = "FreeNight")
						protected FreeNightType freeNight;
						@XmlElement(name = "LastMinute")
						protected LastMinuteType lastMinute;
						@XmlElement(name = "Miscellaneous")
						protected MiscellaneousType miscellaneous;
						@XmlElement(name = "PercentageTrip")
						protected PercentageTripType percentageTrip;
						@XmlElement(name = "ReductionPax")
						protected ReductionPaxType reductionPax;
						@XmlElement(name = "Single")
						protected SingleType single;
						@XmlAttribute
						protected Integer code;
						@XmlAttribute(required = true)
						protected String type;

						/**
						 * Gets the value of the earlyBooking property.
						 * 
						 * @return possible object is {@link EarlyBookingType }
						 * 
						 */
						public EarlyBookingType getEarlyBooking() {
							return earlyBooking;
						}

						/**
						 * Sets the value of the earlyBooking property.
						 * 
						 * @param value
						 *            allowed object is {@link EarlyBookingType
						 *            }
						 * 
						 */
						public void setEarlyBooking(EarlyBookingType value) {
							this.earlyBooking = value;
						}

						/**
						 * Gets the value of the freeAdult property.
						 * 
						 * @return possible object is {@link FreeAdultType }
						 * 
						 */
						public FreeAdultType getFreeAdult() {
							return freeAdult;
						}

						/**
						 * Sets the value of the freeAdult property.
						 * 
						 * @param value
						 *            allowed object is {@link FreeAdultType }
						 * 
						 */
						public void setFreeAdult(FreeAdultType value) {
							this.freeAdult = value;
						}

						/**
						 * Gets the value of the freeChild property.
						 * 
						 * @return possible object is {@link FreeChildType }
						 * 
						 */
						public FreeChildType getFreeChild() {
							return freeChild;
						}

						/**
						 * Sets the value of the freeChild property.
						 * 
						 * @param value
						 *            allowed object is {@link FreeChildType }
						 * 
						 */
						public void setFreeChild(FreeChildType value) {
							this.freeChild = value;
						}

						/**
						 * Gets the value of the freeNight property.
						 * 
						 * @return possible object is {@link FreeNightType }
						 * 
						 */
						public FreeNightType getFreeNight() {
							return freeNight;
						}

						/**
						 * Sets the value of the freeNight property.
						 * 
						 * @param value
						 *            allowed object is {@link FreeNightType }
						 * 
						 */
						public void setFreeNight(FreeNightType value) {
							this.freeNight = value;
						}

						/**
						 * Gets the value of the lastMinute property.
						 * 
						 * @return possible object is {@link LastMinuteType }
						 * 
						 */
						public LastMinuteType getLastMinute() {
							return lastMinute;
						}

						/**
						 * Sets the value of the lastMinute property.
						 * 
						 * @param value
						 *            allowed object is {@link LastMinuteType }
						 * 
						 */
						public void setLastMinute(LastMinuteType value) {
							this.lastMinute = value;
						}

						/**
						 * Gets the value of the miscellaneous property.
						 * 
						 * @return possible object is {@link MiscellaneousType }
						 * 
						 */
						public MiscellaneousType getMiscellaneous() {
							return miscellaneous;
						}

						/**
						 * Sets the value of the miscellaneous property.
						 * 
						 * @param value
						 *            allowed object is {@link MiscellaneousType
						 *            }
						 * 
						 */
						public void setMiscellaneous(MiscellaneousType value) {
							this.miscellaneous = value;
						}

						/**
						 * Gets the value of the percentageTrip property.
						 * 
						 * @return possible object is {@link PercentageTripType
						 *         }
						 * 
						 */
						public PercentageTripType getPercentageTrip() {
							return percentageTrip;
						}

						/**
						 * Sets the value of the percentageTrip property.
						 * 
						 * @param value
						 *            allowed object is
						 *            {@link PercentageTripType }
						 * 
						 */
						public void setPercentageTrip(PercentageTripType value) {
							this.percentageTrip = value;
						}

						/**
						 * Gets the value of the reductionPax property.
						 * 
						 * @return possible object is {@link ReductionPaxType }
						 * 
						 */
						public ReductionPaxType getReductionPax() {
							return reductionPax;
						}

						/**
						 * Sets the value of the reductionPax property.
						 * 
						 * @param value
						 *            allowed object is {@link ReductionPaxType
						 *            }
						 * 
						 */
						public void setReductionPax(ReductionPaxType value) {
							this.reductionPax = value;
						}

						/**
						 * Gets the value of the single property.
						 * 
						 * @return possible object is {@link SingleType }
						 * 
						 */
						public SingleType getSingle() {
							return single;
						}

						/**
						 * Sets the value of the single property.
						 * 
						 * @param value
						 *            allowed object is {@link SingleType }
						 * 
						 */
						public void setSingle(SingleType value) {
							this.single = value;
						}

						/**
						 * Gets the value of the code property.
						 * 
						 * @return possible object is {@link Integer }
						 * 
						 */
						public Integer getCode() {
							return code;
						}

						/**
						 * Sets the value of the code property.
						 * 
						 * @param value
						 *            allowed object is {@link Integer }
						 * 
						 */
						public void setCode(Integer value) {
							this.code = value;
						}

						/**
						 * Gets the value of the type property.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getType() {
							return type;
						}

						/**
						 * Sets the value of the type property.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setType(String value) {
							this.type = value;
						}

					}

				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Taxes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}taxes" maxOccurs="unbounded" minOccurs="0"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "taxes" })
			public static class TaxInformation {

				@XmlElement(name = "Taxes")
				protected List<Taxes> taxes;

				/**
				 * Gets the value of the taxes property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the taxes
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getTaxes().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link Taxes }
				 * 
				 * 
				 */
				public List<Taxes> getTaxes() {
					if (taxes == null) {
						taxes = new ArrayList<Taxes>();
					}
					return this.taxes;
				}

			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="Descriptions" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Description" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}description_type" maxOccurs="unbounded"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Facilities" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Facility" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}facility_type" maxOccurs="unbounded"/>
		 *                 &lt;/sequence>
		 *                 &lt;attribute name="facilities_with_program_data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
		 *                 &lt;attribute name="facilities_without_program_data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Locations" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Location" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}location_type" maxOccurs="unbounded"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Areas" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Area" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}area_type" maxOccurs="unbounded"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Pictures" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Picture" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}picture_type" maxOccurs="unbounded"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="HostingTypes" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}hosting_types_type" minOccurs="0"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "descriptions", "facilities", "locations", "areas", "pictures",
				"hostingTypes" })
		public static class DescriptionInformations {

			@XmlElement(name = "Descriptions")
			protected AccomDescription.Accommodation.DescriptionInformations.Descriptions descriptions;
			@XmlElement(name = "Facilities")
			protected AccomDescription.Accommodation.DescriptionInformations.Facilities facilities;
			@XmlElement(name = "Locations")
			protected AccomDescription.Accommodation.DescriptionInformations.Locations locations;
			@XmlElement(name = "Areas")
			protected AccomDescription.Accommodation.DescriptionInformations.Areas areas;
			@XmlElement(name = "Pictures")
			protected AccomDescription.Accommodation.DescriptionInformations.Pictures pictures;
			@XmlElement(name = "HostingTypes")
			protected HostingTypesType hostingTypes;

			/**
			 * Gets the value of the descriptions property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.DescriptionInformations.Descriptions }
			 * 
			 */
			public AccomDescription.Accommodation.DescriptionInformations.Descriptions getDescriptions() {
				return descriptions;
			}

			/**
			 * Sets the value of the descriptions property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.DescriptionInformations.Descriptions }
			 * 
			 */
			public void setDescriptions(AccomDescription.Accommodation.DescriptionInformations.Descriptions value) {
				this.descriptions = value;
			}

			/**
			 * Gets the value of the facilities property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.DescriptionInformations.Facilities }
			 * 
			 */
			public AccomDescription.Accommodation.DescriptionInformations.Facilities getFacilities() {
				return facilities;
			}

			/**
			 * Sets the value of the facilities property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.DescriptionInformations.Facilities }
			 * 
			 */
			public void setFacilities(AccomDescription.Accommodation.DescriptionInformations.Facilities value) {
				this.facilities = value;
			}

			/**
			 * Gets the value of the locations property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.DescriptionInformations.Locations }
			 * 
			 */
			public AccomDescription.Accommodation.DescriptionInformations.Locations getLocations() {
				return locations;
			}

			/**
			 * Sets the value of the locations property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.DescriptionInformations.Locations }
			 * 
			 */
			public void setLocations(AccomDescription.Accommodation.DescriptionInformations.Locations value) {
				this.locations = value;
			}

			/**
			 * Gets the value of the areas property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.DescriptionInformations.Areas }
			 * 
			 */
			public AccomDescription.Accommodation.DescriptionInformations.Areas getAreas() {
				return areas;
			}

			/**
			 * Sets the value of the areas property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.DescriptionInformations.Areas }
			 * 
			 */
			public void setAreas(AccomDescription.Accommodation.DescriptionInformations.Areas value) {
				this.areas = value;
			}

			/**
			 * Gets the value of the pictures property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.DescriptionInformations.Pictures }
			 * 
			 */
			public AccomDescription.Accommodation.DescriptionInformations.Pictures getPictures() {
				return pictures;
			}

			/**
			 * Sets the value of the pictures property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.DescriptionInformations.Pictures }
			 * 
			 */
			public void setPictures(AccomDescription.Accommodation.DescriptionInformations.Pictures value) {
				this.pictures = value;
			}

			/**
			 * Gets the value of the hostingTypes property.
			 * 
			 * @return possible object is {@link HostingTypesType }
			 * 
			 */
			public HostingTypesType getHostingTypes() {
				return hostingTypes;
			}

			/**
			 * Sets the value of the hostingTypes property.
			 * 
			 * @param value
			 *            allowed object is {@link HostingTypesType }
			 * 
			 */
			public void setHostingTypes(HostingTypesType value) {
				this.hostingTypes = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Area" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}area_type" maxOccurs="unbounded"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "area" })
			public static class Areas {

				@XmlElement(name = "Area", required = true)
				protected List<AreaType> area;

				/**
				 * Gets the value of the area property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the area
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getArea().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link AreaType }
				 * 
				 * 
				 */
				public List<AreaType> getArea() {
					if (area == null) {
						area = new ArrayList<AreaType>();
					}
					return this.area;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Description" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}description_type" maxOccurs="unbounded"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "description" })
			public static class Descriptions {

				@XmlElement(name = "Description", required = true)
				protected List<DescriptionType> description;

				/**
				 * Gets the value of the description property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the
				 * description property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getDescription().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link DescriptionType }
				 * 
				 * 
				 */
				public List<DescriptionType> getDescription() {
					if (description == null) {
						description = new ArrayList<DescriptionType>();
					}
					return this.description;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Facility" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}facility_type" maxOccurs="unbounded"/>
			 *       &lt;/sequence>
			 *       &lt;attribute name="facilities_with_program_data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
			 *       &lt;attribute name="facilities_without_program_data_policy" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}data_policy_type" />
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "facility" })
			public static class Facilities {

				@XmlElement(name = "Facility", required = true)
				protected List<FacilityType> facility;
				@XmlAttribute(name = "facilities_with_program_data_policy")
				protected DataPolicyType facilitiesWithProgramDataPolicy;
				@XmlAttribute(name = "facilities_without_program_data_policy")
				protected DataPolicyType facilitiesWithoutProgramDataPolicy;

				/**
				 * Gets the value of the facility property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the facility
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getFacility().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link FacilityType }
				 * 
				 * 
				 */
				public List<FacilityType> getFacility() {
					if (facility == null) {
						facility = new ArrayList<FacilityType>();
					}
					return this.facility;
				}

				/**
				 * Gets the value of the facilitiesWithProgramDataPolicy
				 * property.
				 * 
				 * @return possible object is {@link DataPolicyType }
				 * 
				 */
				public DataPolicyType getFacilitiesWithProgramDataPolicy() {
					return facilitiesWithProgramDataPolicy;
				}

				/**
				 * Sets the value of the facilitiesWithProgramDataPolicy
				 * property.
				 * 
				 * @param value
				 *            allowed object is {@link DataPolicyType }
				 * 
				 */
				public void setFacilitiesWithProgramDataPolicy(DataPolicyType value) {
					this.facilitiesWithProgramDataPolicy = value;
				}

				/**
				 * Gets the value of the facilitiesWithoutProgramDataPolicy
				 * property.
				 * 
				 * @return possible object is {@link DataPolicyType }
				 * 
				 */
				public DataPolicyType getFacilitiesWithoutProgramDataPolicy() {
					return facilitiesWithoutProgramDataPolicy;
				}

				/**
				 * Sets the value of the facilitiesWithoutProgramDataPolicy
				 * property.
				 * 
				 * @param value
				 *            allowed object is {@link DataPolicyType }
				 * 
				 */
				public void setFacilitiesWithoutProgramDataPolicy(DataPolicyType value) {
					this.facilitiesWithoutProgramDataPolicy = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Location" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}location_type" maxOccurs="unbounded"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "location" })
			public static class Locations {

				@XmlElement(name = "Location", required = true)
				protected List<LocationType> location;

				/**
				 * Gets the value of the location property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the location
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getLocation().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link LocationType }
				 * 
				 * 
				 */
				public List<LocationType> getLocation() {
					if (location == null) {
						location = new ArrayList<LocationType>();
					}
					return this.location;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Picture" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}picture_type" maxOccurs="unbounded"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "picture" })
			public static class Pictures {

				@XmlElement(name = "Picture", required = true)
				protected List<PictureTypeElement> picture;

				/**
				 * Gets the value of the picture property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the picture
				 * property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getPicture().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link PictureTypeElement }
				 * 
				 * 
				 */
				public List<PictureTypeElement> getPicture() {
					if (picture == null) {
						picture = new ArrayList<PictureTypeElement>();
					}
					return this.picture;
				}

			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="Brand" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;simpleContent>
		 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
		 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *               &lt;/extension>
		 *             &lt;/simpleContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Chain" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;simpleContent>
		 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
		 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
		 *               &lt;/extension>
		 *             &lt;/simpleContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Category" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}category_code_type" minOccurs="0"/>
		 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="AddressComplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="City" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;simpleContent>
		 *               &lt;extension base="&lt;http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas>city_type">
		 *               &lt;/extension>
		 *             &lt;/simpleContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
		 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
		 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="ShortDescription" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}description_type" minOccurs="0"/>
		 *         &lt;element name="CurrencyCode" type="{http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas}currency_code_type" minOccurs="0"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "name", "brand", "chain", "category", "address", "addressComplement", "zip",
				"city", "latitude", "longitude", "phone", "mail", "shortDescription", "currencyCode" })
		public static class GeneralInformation {

			@XmlElement(name = "Name")
			protected String name;
			@XmlElement(name = "Brand")
			protected AccomDescription.Accommodation.GeneralInformation.Brand brand;
			@XmlElement(name = "Chain")
			protected AccomDescription.Accommodation.GeneralInformation.Chain chain;
			@XmlElement(name = "Category")
			protected Integer category;
			@XmlElement(name = "Address")
			protected String address;
			@XmlElement(name = "AddressComplement")
			protected String addressComplement;
			@XmlElement(name = "Zip")
			protected String zip;
			@XmlElement(name = "City")
			protected AccomDescription.Accommodation.GeneralInformation.City city;
			@XmlElement(name = "Latitude")
			protected Double latitude;
			@XmlElement(name = "Longitude")
			protected Double longitude;
			@XmlElement(name = "Phone")
			protected String phone;
			@XmlElement(name = "Mail")
			protected String mail;
			@XmlElement(name = "ShortDescription")
			protected DescriptionType shortDescription;
			@XmlElement(name = "CurrencyCode")
			protected String currencyCode;

			/**
			 * Gets the value of the name property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getName() {
				return name;
			}

			/**
			 * Sets the value of the name property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setName(String value) {
				this.name = value;
			}

			/**
			 * Gets the value of the brand property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.GeneralInformation.Brand }
			 * 
			 */
			public AccomDescription.Accommodation.GeneralInformation.Brand getBrand() {
				return brand;
			}

			/**
			 * Sets the value of the brand property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.GeneralInformation.Brand }
			 * 
			 */
			public void setBrand(AccomDescription.Accommodation.GeneralInformation.Brand value) {
				this.brand = value;
			}

			/**
			 * Gets the value of the chain property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.GeneralInformation.Chain }
			 * 
			 */
			public AccomDescription.Accommodation.GeneralInformation.Chain getChain() {
				return chain;
			}

			/**
			 * Sets the value of the chain property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.GeneralInformation.Chain }
			 * 
			 */
			public void setChain(AccomDescription.Accommodation.GeneralInformation.Chain value) {
				this.chain = value;
			}

			/**
			 * Gets the value of the category property.
			 * 
			 * @return possible object is {@link Integer }
			 * 
			 */
			public Integer getCategory() {
				return category;
			}

			/**
			 * Sets the value of the category property.
			 * 
			 * @param value
			 *            allowed object is {@link Integer }
			 * 
			 */
			public void setCategory(Integer value) {
				this.category = value;
			}

			/**
			 * Gets the value of the address property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAddress() {
				return address;
			}

			/**
			 * Sets the value of the address property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAddress(String value) {
				this.address = value;
			}

			/**
			 * Gets the value of the addressComplement property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAddressComplement() {
				return addressComplement;
			}

			/**
			 * Sets the value of the addressComplement property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAddressComplement(String value) {
				this.addressComplement = value;
			}

			/**
			 * Gets the value of the zip property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getZip() {
				return zip;
			}

			/**
			 * Sets the value of the zip property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setZip(String value) {
				this.zip = value;
			}

			/**
			 * Gets the value of the city property.
			 * 
			 * @return possible object is
			 *         {@link AccomDescription.Accommodation.GeneralInformation.City }
			 * 
			 */
			public AccomDescription.Accommodation.GeneralInformation.City getCity() {
				return city;
			}

			/**
			 * Sets the value of the city property.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link AccomDescription.Accommodation.GeneralInformation.City }
			 * 
			 */
			public void setCity(AccomDescription.Accommodation.GeneralInformation.City value) {
				this.city = value;
			}

			/**
			 * Gets the value of the latitude property.
			 * 
			 * @return possible object is {@link Double }
			 * 
			 */
			public Double getLatitude() {
				return latitude;
			}

			/**
			 * Sets the value of the latitude property.
			 * 
			 * @param value
			 *            allowed object is {@link Double }
			 * 
			 */
			public void setLatitude(Double value) {
				this.latitude = value;
			}

			/**
			 * Gets the value of the longitude property.
			 * 
			 * @return possible object is {@link Double }
			 * 
			 */
			public Double getLongitude() {
				return longitude;
			}

			/**
			 * Sets the value of the longitude property.
			 * 
			 * @param value
			 *            allowed object is {@link Double }
			 * 
			 */
			public void setLongitude(Double value) {
				this.longitude = value;
			}

			/**
			 * Gets the value of the phone property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPhone() {
				return phone;
			}

			/**
			 * Sets the value of the phone property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPhone(String value) {
				this.phone = value;
			}

			/**
			 * Gets the value of the mail property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMail() {
				return mail;
			}

			/**
			 * Sets the value of the mail property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setMail(String value) {
				this.mail = value;
			}

			/**
			 * Gets the value of the shortDescription property.
			 * 
			 * @return possible object is {@link DescriptionType }
			 * 
			 */
			public DescriptionType getShortDescription() {
				return shortDescription;
			}

			/**
			 * Sets the value of the shortDescription property.
			 * 
			 * @param value
			 *            allowed object is {@link DescriptionType }
			 * 
			 */
			public void setShortDescription(DescriptionType value) {
				this.shortDescription = value;
			}

			/**
			 * Gets the value of the currencyCode property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCurrencyCode() {
				return currencyCode;
			}

			/**
			 * Sets the value of the currencyCode property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCurrencyCode(String value) {
				this.currencyCode = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;simpleContent>
			 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
			 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *     &lt;/extension>
			 *   &lt;/simpleContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "value" })
			public static class Brand {

				@XmlValue
				protected String value;
				@XmlAttribute
				protected String code;

				/**
				 * Gets the value of the value property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getValue() {
					return value;
				}

				/**
				 * Sets the value of the value property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setValue(String value) {
					this.value = value;
				}

				/**
				 * Gets the value of the code property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getCode() {
					return code;
				}

				/**
				 * Sets the value of the code property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setCode(String value) {
					this.code = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;simpleContent>
			 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
			 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
			 *     &lt;/extension>
			 *   &lt;/simpleContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "value" })
			public static class Chain {

				@XmlValue
				protected String value;
				@XmlAttribute
				protected String code;

				/**
				 * Gets the value of the value property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getValue() {
					return value;
				}

				/**
				 * Sets the value of the value property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setValue(String value) {
					this.value = value;
				}

				/**
				 * Gets the value of the code property.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getCode() {
					return code;
				}

				/**
				 * Sets the value of the code property.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setCode(String value) {
					this.code = value;
				}

			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content
			 * contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;simpleContent>
			 *     &lt;extension base="&lt;http://webservice.adapter.channelmanager.othyssia.koedia.com/document/v0.1/schemas>city_type">
			 *     &lt;/extension>
			 *   &lt;/simpleContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			public static class City extends CityType {

			}

		}

	}

}
