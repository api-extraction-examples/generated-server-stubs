from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Location(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, lat=None, lng=None, address=None):  # noqa: E501
        """Location - a model defined in OpenAPI

        :param lat: The lat of this Location.  # noqa: E501
        :type lat: float
        :param lng: The lng of this Location.  # noqa: E501
        :type lng: float
        :param address: The address of this Location.  # noqa: E501
        :type address: str
        """
        self.openapi_types = {
            'lat': float,
            'lng': float,
            'address': str
        }

        self.attribute_map = {
            'lat': 'lat',
            'lng': 'lng',
            'address': 'address'
        }

        self._lat = lat
        self._lng = lng
        self._address = address

    @classmethod
    def from_dict(cls, dikt) -> 'Location':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Location of this Location.  # noqa: E501
        :rtype: Location
        """
        return util.deserialize_model(dikt, cls)

    @property
    def lat(self) -> float:
        """Gets the lat of this Location.

        The latitude component of a location  # noqa: E501

        :return: The lat of this Location.
        :rtype: float
        """
        return self._lat

    @lat.setter
    def lat(self, lat: float):
        """Sets the lat of this Location.

        The latitude component of a location  # noqa: E501

        :param lat: The lat of this Location.
        :type lat: float
        """
        if lat is None:
            raise ValueError("Invalid value for `lat`, must not be `None`")  # noqa: E501

        self._lat = lat

    @property
    def lng(self) -> float:
        """Gets the lng of this Location.

        The longitude component of a location  # noqa: E501

        :return: The lng of this Location.
        :rtype: float
        """
        return self._lng

    @lng.setter
    def lng(self, lng: float):
        """Sets the lng of this Location.

        The longitude component of a location  # noqa: E501

        :param lng: The lng of this Location.
        :type lng: float
        """
        if lng is None:
            raise ValueError("Invalid value for `lng`, must not be `None`")  # noqa: E501

        self._lng = lng

    @property
    def address(self) -> str:
        """Gets the address of this Location.

        A human readable address at/near the given location  # noqa: E501

        :return: The address of this Location.
        :rtype: str
        """
        return self._address

    @address.setter
    def address(self, address: str):
        """Sets the address of this Location.

        A human readable address at/near the given location  # noqa: E501

        :param address: The address of this Location.
        :type address: str
        """

        self._address = address