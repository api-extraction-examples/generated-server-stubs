from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FieldConfiguration(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, id=None, is_default=None, name=None):  # noqa: E501
        """FieldConfiguration - a model defined in OpenAPI

        :param description: The description of this FieldConfiguration.  # noqa: E501
        :type description: str
        :param id: The id of this FieldConfiguration.  # noqa: E501
        :type id: int
        :param is_default: The is_default of this FieldConfiguration.  # noqa: E501
        :type is_default: bool
        :param name: The name of this FieldConfiguration.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'description': str,
            'id': int,
            'is_default': bool,
            'name': str
        }

        self.attribute_map = {
            'description': 'description',
            'id': 'id',
            'is_default': 'isDefault',
            'name': 'name'
        }

        self._description = description
        self._id = id
        self._is_default = is_default
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'FieldConfiguration':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FieldConfiguration of this FieldConfiguration.  # noqa: E501
        :rtype: FieldConfiguration
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this FieldConfiguration.

        The description of the field configuration.  # noqa: E501

        :return: The description of this FieldConfiguration.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this FieldConfiguration.

        The description of the field configuration.  # noqa: E501

        :param description: The description of this FieldConfiguration.
        :type description: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def id(self) -> int:
        """Gets the id of this FieldConfiguration.

        The ID of the field configuration.  # noqa: E501

        :return: The id of this FieldConfiguration.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this FieldConfiguration.

        The ID of the field configuration.  # noqa: E501

        :param id: The id of this FieldConfiguration.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def is_default(self) -> bool:
        """Gets the is_default of this FieldConfiguration.

        Whether the field configuration is the default.  # noqa: E501

        :return: The is_default of this FieldConfiguration.
        :rtype: bool
        """
        return self._is_default

    @is_default.setter
    def is_default(self, is_default: bool):
        """Sets the is_default of this FieldConfiguration.

        Whether the field configuration is the default.  # noqa: E501

        :param is_default: The is_default of this FieldConfiguration.
        :type is_default: bool
        """

        self._is_default = is_default

    @property
    def name(self) -> str:
        """Gets the name of this FieldConfiguration.

        The name of the field configuration.  # noqa: E501

        :return: The name of this FieldConfiguration.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this FieldConfiguration.

        The name of the field configuration.  # noqa: E501

        :param name: The name of this FieldConfiguration.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name
