from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ServiceCreate201Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, warning=None):  # noqa: E501
        """ServiceCreate201Response - a model defined in OpenAPI

        :param id: The id of this ServiceCreate201Response.  # noqa: E501
        :type id: str
        :param warning: The warning of this ServiceCreate201Response.  # noqa: E501
        :type warning: str
        """
        self.openapi_types = {
            'id': str,
            'warning': str
        }

        self.attribute_map = {
            'id': 'ID',
            'warning': 'Warning'
        }

        self._id = id
        self._warning = warning

    @classmethod
    def from_dict(cls, dikt) -> 'ServiceCreate201Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ServiceCreate_201_response of this ServiceCreate201Response.  # noqa: E501
        :rtype: ServiceCreate201Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this ServiceCreate201Response.

        The ID of the created service.  # noqa: E501

        :return: The id of this ServiceCreate201Response.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ServiceCreate201Response.

        The ID of the created service.  # noqa: E501

        :param id: The id of this ServiceCreate201Response.
        :type id: str
        """

        self._id = id

    @property
    def warning(self) -> str:
        """Gets the warning of this ServiceCreate201Response.

        Optional warning message  # noqa: E501

        :return: The warning of this ServiceCreate201Response.
        :rtype: str
        """
        return self._warning

    @warning.setter
    def warning(self, warning: str):
        """Sets the warning of this ServiceCreate201Response.

        Optional warning message  # noqa: E501

        :param warning: The warning of this ServiceCreate201Response.
        :type warning: str
        """

        self._warning = warning
