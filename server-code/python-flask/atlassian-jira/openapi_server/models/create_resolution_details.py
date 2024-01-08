from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateResolutionDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, name=None):  # noqa: E501
        """CreateResolutionDetails - a model defined in OpenAPI

        :param description: The description of this CreateResolutionDetails.  # noqa: E501
        :type description: str
        :param name: The name of this CreateResolutionDetails.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'description': str,
            'name': str
        }

        self.attribute_map = {
            'description': 'description',
            'name': 'name'
        }

        self._description = description
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'CreateResolutionDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateResolutionDetails of this CreateResolutionDetails.  # noqa: E501
        :rtype: CreateResolutionDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this CreateResolutionDetails.

        The description of the resolution.  # noqa: E501

        :return: The description of this CreateResolutionDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this CreateResolutionDetails.

        The description of the resolution.  # noqa: E501

        :param description: The description of this CreateResolutionDetails.
        :type description: str
        """
        if description is not None and len(description) > 255:
            raise ValueError("Invalid value for `description`, length must be less than or equal to `255`")  # noqa: E501

        self._description = description

    @property
    def name(self) -> str:
        """Gets the name of this CreateResolutionDetails.

        The name of the resolution. Must be unique (case-insensitive).  # noqa: E501

        :return: The name of this CreateResolutionDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CreateResolutionDetails.

        The name of the resolution. Must be unique (case-insensitive).  # noqa: E501

        :param name: The name of this CreateResolutionDetails.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501
        if name is not None and len(name) > 60:
            raise ValueError("Invalid value for `name`, length must be less than or equal to `60`")  # noqa: E501

        self._name = name
