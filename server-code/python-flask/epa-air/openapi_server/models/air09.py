from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.air10 import Air10
from openapi_server.models.geo import Geo
from openapi_server import util

from openapi_server.models.air10 import Air10  # noqa: E501
from openapi_server.models.geo import Geo  # noqa: E501

class Air09(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, geometry=None, properties=None, type=None):  # noqa: E501
        """Air09 - a model defined in OpenAPI

        :param geometry: The geometry of this Air09.  # noqa: E501
        :type geometry: Geo
        :param properties: The properties of this Air09.  # noqa: E501
        :type properties: Air10
        :param type: The type of this Air09.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'geometry': Geo,
            'properties': Air10,
            'type': str
        }

        self.attribute_map = {
            'geometry': 'geometry',
            'properties': 'properties',
            'type': 'type'
        }

        self._geometry = geometry
        self._properties = properties
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'Air09':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The air09 of this Air09.  # noqa: E501
        :rtype: Air09
        """
        return util.deserialize_model(dikt, cls)

    @property
    def geometry(self) -> Geo:
        """Gets the geometry of this Air09.


        :return: The geometry of this Air09.
        :rtype: Geo
        """
        return self._geometry

    @geometry.setter
    def geometry(self, geometry: Geo):
        """Sets the geometry of this Air09.


        :param geometry: The geometry of this Air09.
        :type geometry: Geo
        """
        if geometry is None:
            raise ValueError("Invalid value for `geometry`, must not be `None`")  # noqa: E501

        self._geometry = geometry

    @property
    def properties(self) -> Air10:
        """Gets the properties of this Air09.


        :return: The properties of this Air09.
        :rtype: Air10
        """
        return self._properties

    @properties.setter
    def properties(self, properties: Air10):
        """Sets the properties of this Air09.


        :param properties: The properties of this Air09.
        :type properties: Air10
        """
        if properties is None:
            raise ValueError("Invalid value for `properties`, must not be `None`")  # noqa: E501

        self._properties = properties

    @property
    def type(self) -> str:
        """Gets the type of this Air09.

        Static marker indicating object is a GeoJSON Feature.  # noqa: E501

        :return: The type of this Air09.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this Air09.

        Static marker indicating object is a GeoJSON Feature.  # noqa: E501

        :param type: The type of this Air09.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
