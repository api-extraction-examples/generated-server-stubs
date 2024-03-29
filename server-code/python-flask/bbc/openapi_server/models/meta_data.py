from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.miscellaneous import Miscellaneous
from openapi_server.models.origin import Origin
from openapi_server import util

from openapi_server.models.miscellaneous import Miscellaneous  # noqa: E501
from openapi_server.models.origin import Origin  # noqa: E501

class MetaData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, miscellaneous=None, origin=None, programme_type=None, type=None):  # noqa: E501
        """MetaData - a model defined in OpenAPI

        :param miscellaneous: The miscellaneous of this MetaData.  # noqa: E501
        :type miscellaneous: Miscellaneous
        :param origin: The origin of this MetaData.  # noqa: E501
        :type origin: Origin
        :param programme_type: The programme_type of this MetaData.  # noqa: E501
        :type programme_type: str
        :param type: The type of this MetaData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'miscellaneous': Miscellaneous,
            'origin': Origin,
            'programme_type': str,
            'type': str
        }

        self.attribute_map = {
            'miscellaneous': 'miscellaneous',
            'origin': 'origin',
            'programme_type': 'programme_type',
            'type': 'type'
        }

        self._miscellaneous = miscellaneous
        self._origin = origin
        self._programme_type = programme_type
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'MetaData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MetaData of this MetaData.  # noqa: E501
        :rtype: MetaData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def miscellaneous(self) -> Miscellaneous:
        """Gets the miscellaneous of this MetaData.


        :return: The miscellaneous of this MetaData.
        :rtype: Miscellaneous
        """
        return self._miscellaneous

    @miscellaneous.setter
    def miscellaneous(self, miscellaneous: Miscellaneous):
        """Sets the miscellaneous of this MetaData.


        :param miscellaneous: The miscellaneous of this MetaData.
        :type miscellaneous: Miscellaneous
        """
        if miscellaneous is None:
            raise ValueError("Invalid value for `miscellaneous`, must not be `None`")  # noqa: E501

        self._miscellaneous = miscellaneous

    @property
    def origin(self) -> Origin:
        """Gets the origin of this MetaData.


        :return: The origin of this MetaData.
        :rtype: Origin
        """
        return self._origin

    @origin.setter
    def origin(self, origin: Origin):
        """Sets the origin of this MetaData.


        :param origin: The origin of this MetaData.
        :type origin: Origin
        """
        if origin is None:
            raise ValueError("Invalid value for `origin`, must not be `None`")  # noqa: E501

        self._origin = origin

    @property
    def programme_type(self) -> str:
        """Gets the programme_type of this MetaData.


        :return: The programme_type of this MetaData.
        :rtype: str
        """
        return self._programme_type

    @programme_type.setter
    def programme_type(self, programme_type: str):
        """Sets the programme_type of this MetaData.


        :param programme_type: The programme_type of this MetaData.
        :type programme_type: str
        """
        if programme_type is None:
            raise ValueError("Invalid value for `programme_type`, must not be `None`")  # noqa: E501

        self._programme_type = programme_type

    @property
    def type(self) -> str:
        """Gets the type of this MetaData.


        :return: The type of this MetaData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this MetaData.


        :param type: The type of this MetaData.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
