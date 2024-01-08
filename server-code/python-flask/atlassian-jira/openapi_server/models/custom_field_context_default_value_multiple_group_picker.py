from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CustomFieldContextDefaultValueMultipleGroupPicker(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, context_id=None, group_ids=None, type=None):  # noqa: E501
        """CustomFieldContextDefaultValueMultipleGroupPicker - a model defined in OpenAPI

        :param context_id: The context_id of this CustomFieldContextDefaultValueMultipleGroupPicker.  # noqa: E501
        :type context_id: str
        :param group_ids: The group_ids of this CustomFieldContextDefaultValueMultipleGroupPicker.  # noqa: E501
        :type group_ids: list[str]
        :param type: The type of this CustomFieldContextDefaultValueMultipleGroupPicker.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'context_id': str,
            'group_ids': list[str],
            'type': str
        }

        self.attribute_map = {
            'context_id': 'contextId',
            'group_ids': 'groupIds',
            'type': 'type'
        }

        self._context_id = context_id
        self._group_ids = group_ids
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'CustomFieldContextDefaultValueMultipleGroupPicker':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomFieldContextDefaultValueMultipleGroupPicker of this CustomFieldContextDefaultValueMultipleGroupPicker.  # noqa: E501
        :rtype: CustomFieldContextDefaultValueMultipleGroupPicker
        """
        return util.deserialize_model(dikt, cls)

    @property
    def context_id(self) -> str:
        """Gets the context_id of this CustomFieldContextDefaultValueMultipleGroupPicker.

        The ID of the context.  # noqa: E501

        :return: The context_id of this CustomFieldContextDefaultValueMultipleGroupPicker.
        :rtype: str
        """
        return self._context_id

    @context_id.setter
    def context_id(self, context_id: str):
        """Sets the context_id of this CustomFieldContextDefaultValueMultipleGroupPicker.

        The ID of the context.  # noqa: E501

        :param context_id: The context_id of this CustomFieldContextDefaultValueMultipleGroupPicker.
        :type context_id: str
        """
        if context_id is None:
            raise ValueError("Invalid value for `context_id`, must not be `None`")  # noqa: E501

        self._context_id = context_id

    @property
    def group_ids(self) -> list[str]:
        """Gets the group_ids of this CustomFieldContextDefaultValueMultipleGroupPicker.

        The IDs of the default groups.  # noqa: E501

        :return: The group_ids of this CustomFieldContextDefaultValueMultipleGroupPicker.
        :rtype: list[str]
        """
        return self._group_ids

    @group_ids.setter
    def group_ids(self, group_ids: list[str]):
        """Sets the group_ids of this CustomFieldContextDefaultValueMultipleGroupPicker.

        The IDs of the default groups.  # noqa: E501

        :param group_ids: The group_ids of this CustomFieldContextDefaultValueMultipleGroupPicker.
        :type group_ids: list[str]
        """
        if group_ids is None:
            raise ValueError("Invalid value for `group_ids`, must not be `None`")  # noqa: E501

        self._group_ids = group_ids

    @property
    def type(self) -> str:
        """Gets the type of this CustomFieldContextDefaultValueMultipleGroupPicker.


        :return: The type of this CustomFieldContextDefaultValueMultipleGroupPicker.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this CustomFieldContextDefaultValueMultipleGroupPicker.


        :param type: The type of this CustomFieldContextDefaultValueMultipleGroupPicker.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
