from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CustomFieldReplacement(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, custom_field_id=None, move_to=None):  # noqa: E501
        """CustomFieldReplacement - a model defined in OpenAPI

        :param custom_field_id: The custom_field_id of this CustomFieldReplacement.  # noqa: E501
        :type custom_field_id: int
        :param move_to: The move_to of this CustomFieldReplacement.  # noqa: E501
        :type move_to: int
        """
        self.openapi_types = {
            'custom_field_id': int,
            'move_to': int
        }

        self.attribute_map = {
            'custom_field_id': 'customFieldId',
            'move_to': 'moveTo'
        }

        self._custom_field_id = custom_field_id
        self._move_to = move_to

    @classmethod
    def from_dict(cls, dikt) -> 'CustomFieldReplacement':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomFieldReplacement of this CustomFieldReplacement.  # noqa: E501
        :rtype: CustomFieldReplacement
        """
        return util.deserialize_model(dikt, cls)

    @property
    def custom_field_id(self) -> int:
        """Gets the custom_field_id of this CustomFieldReplacement.

        The ID of the custom field in which to replace the version number.  # noqa: E501

        :return: The custom_field_id of this CustomFieldReplacement.
        :rtype: int
        """
        return self._custom_field_id

    @custom_field_id.setter
    def custom_field_id(self, custom_field_id: int):
        """Sets the custom_field_id of this CustomFieldReplacement.

        The ID of the custom field in which to replace the version number.  # noqa: E501

        :param custom_field_id: The custom_field_id of this CustomFieldReplacement.
        :type custom_field_id: int
        """

        self._custom_field_id = custom_field_id

    @property
    def move_to(self) -> int:
        """Gets the move_to of this CustomFieldReplacement.

        The version number to use as a replacement for the deleted version.  # noqa: E501

        :return: The move_to of this CustomFieldReplacement.
        :rtype: int
        """
        return self._move_to

    @move_to.setter
    def move_to(self, move_to: int):
        """Sets the move_to of this CustomFieldReplacement.

        The version number to use as a replacement for the deleted version.  # noqa: E501

        :param move_to: The move_to of this CustomFieldReplacement.
        :type move_to: int
        """

        self._move_to = move_to
