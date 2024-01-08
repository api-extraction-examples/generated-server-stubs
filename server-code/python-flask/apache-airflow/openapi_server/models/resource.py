from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Resource(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None):  # noqa: E501
        """Resource - a model defined in OpenAPI

        :param name: The name of this Resource.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'name': str
        }

        self.attribute_map = {
            'name': 'name'
        }

        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'Resource':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Resource of this Resource.  # noqa: E501
        :rtype: Resource
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this Resource.

        The name of the resource  # noqa: E501

        :return: The name of this Resource.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Resource.

        The name of the resource  # noqa: E501

        :param name: The name of this Resource.
        :type name: str
        """

        self._name = name