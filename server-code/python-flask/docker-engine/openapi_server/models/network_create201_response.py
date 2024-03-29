from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class NetworkCreate201Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, warning=None):  # noqa: E501
        """NetworkCreate201Response - a model defined in OpenAPI

        :param id: The id of this NetworkCreate201Response.  # noqa: E501
        :type id: str
        :param warning: The warning of this NetworkCreate201Response.  # noqa: E501
        :type warning: str
        """
        self.openapi_types = {
            'id': str,
            'warning': str
        }

        self.attribute_map = {
            'id': 'Id',
            'warning': 'Warning'
        }

        self._id = id
        self._warning = warning

    @classmethod
    def from_dict(cls, dikt) -> 'NetworkCreate201Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NetworkCreate_201_response of this NetworkCreate201Response.  # noqa: E501
        :rtype: NetworkCreate201Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this NetworkCreate201Response.

        The ID of the created network.  # noqa: E501

        :return: The id of this NetworkCreate201Response.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this NetworkCreate201Response.

        The ID of the created network.  # noqa: E501

        :param id: The id of this NetworkCreate201Response.
        :type id: str
        """

        self._id = id

    @property
    def warning(self) -> str:
        """Gets the warning of this NetworkCreate201Response.


        :return: The warning of this NetworkCreate201Response.
        :rtype: str
        """
        return self._warning

    @warning.setter
    def warning(self, warning: str):
        """Sets the warning of this NetworkCreate201Response.


        :param warning: The warning of this NetworkCreate201Response.
        :type warning: str
        """

        self._warning = warning
