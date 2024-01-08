from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Address(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, address_addition=None, city=None, country_iso_code=None, district=None, street=None, zip_code=None):  # noqa: E501
        """Address - a model defined in OpenAPI

        :param address_addition: The address_addition of this Address.  # noqa: E501
        :type address_addition: str
        :param city: The city of this Address.  # noqa: E501
        :type city: str
        :param country_iso_code: The country_iso_code of this Address.  # noqa: E501
        :type country_iso_code: str
        :param district: The district of this Address.  # noqa: E501
        :type district: str
        :param street: The street of this Address.  # noqa: E501
        :type street: str
        :param zip_code: The zip_code of this Address.  # noqa: E501
        :type zip_code: str
        """
        self.openapi_types = {
            'address_addition': str,
            'city': str,
            'country_iso_code': str,
            'district': str,
            'street': str,
            'zip_code': str
        }

        self.attribute_map = {
            'address_addition': 'addressAddition',
            'city': 'city',
            'country_iso_code': 'countryIsoCode',
            'district': 'district',
            'street': 'street',
            'zip_code': 'zipCode'
        }

        self._address_addition = address_addition
        self._city = city
        self._country_iso_code = country_iso_code
        self._district = district
        self._street = street
        self._zip_code = zip_code

    @classmethod
    def from_dict(cls, dikt) -> 'Address':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Address of this Address.  # noqa: E501
        :rtype: Address
        """
        return util.deserialize_model(dikt, cls)

    @property
    def address_addition(self) -> str:
        """Gets the address_addition of this Address.

        address addition  # noqa: E501

        :return: The address_addition of this Address.
        :rtype: str
        """
        return self._address_addition

    @address_addition.setter
    def address_addition(self, address_addition: str):
        """Sets the address_addition of this Address.

        address addition  # noqa: E501

        :param address_addition: The address_addition of this Address.
        :type address_addition: str
        """

        self._address_addition = address_addition

    @property
    def city(self) -> str:
        """Gets the city of this Address.

        city  # noqa: E501

        :return: The city of this Address.
        :rtype: str
        """
        return self._city

    @city.setter
    def city(self, city: str):
        """Sets the city of this Address.

        city  # noqa: E501

        :param city: The city of this Address.
        :type city: str
        """

        self._city = city

    @property
    def country_iso_code(self) -> str:
        """Gets the country_iso_code of this Address.

        ISO A2 country code  # noqa: E501

        :return: The country_iso_code of this Address.
        :rtype: str
        """
        return self._country_iso_code

    @country_iso_code.setter
    def country_iso_code(self, country_iso_code: str):
        """Sets the country_iso_code of this Address.

        ISO A2 country code  # noqa: E501

        :param country_iso_code: The country_iso_code of this Address.
        :type country_iso_code: str
        """

        self._country_iso_code = country_iso_code

    @property
    def district(self) -> str:
        """Gets the district of this Address.

        district, area of city  # noqa: E501

        :return: The district of this Address.
        :rtype: str
        """
        return self._district

    @district.setter
    def district(self, district: str):
        """Sets the district of this Address.

        district, area of city  # noqa: E501

        :param district: The district of this Address.
        :type district: str
        """

        self._district = district

    @property
    def street(self) -> str:
        """Gets the street of this Address.

        street and house number, if applicable  # noqa: E501

        :return: The street of this Address.
        :rtype: str
        """
        return self._street

    @street.setter
    def street(self, street: str):
        """Sets the street of this Address.

        street and house number, if applicable  # noqa: E501

        :param street: The street of this Address.
        :type street: str
        """

        self._street = street

    @property
    def zip_code(self) -> str:
        """Gets the zip_code of this Address.

        postal code  # noqa: E501

        :return: The zip_code of this Address.
        :rtype: str
        """
        return self._zip_code

    @zip_code.setter
    def zip_code(self, zip_code: str):
        """Sets the zip_code of this Address.

        postal code  # noqa: E501

        :param zip_code: The zip_code of this Address.
        :type zip_code: str
        """

        self._zip_code = zip_code