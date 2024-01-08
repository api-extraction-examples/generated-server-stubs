from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class MultipleCustomFieldValuesUpdate(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, custom_field=None, issue_ids=None, value=None):  # noqa: E501
        """MultipleCustomFieldValuesUpdate - a model defined in OpenAPI

        :param custom_field: The custom_field of this MultipleCustomFieldValuesUpdate.  # noqa: E501
        :type custom_field: str
        :param issue_ids: The issue_ids of this MultipleCustomFieldValuesUpdate.  # noqa: E501
        :type issue_ids: List[int]
        :param value: The value of this MultipleCustomFieldValuesUpdate.  # noqa: E501
        :type value: object
        """
        self.openapi_types = {
            'custom_field': str,
            'issue_ids': List[int],
            'value': object
        }

        self.attribute_map = {
            'custom_field': 'customField',
            'issue_ids': 'issueIds',
            'value': 'value'
        }

        self._custom_field = custom_field
        self._issue_ids = issue_ids
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'MultipleCustomFieldValuesUpdate':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MultipleCustomFieldValuesUpdate of this MultipleCustomFieldValuesUpdate.  # noqa: E501
        :rtype: MultipleCustomFieldValuesUpdate
        """
        return util.deserialize_model(dikt, cls)

    @property
    def custom_field(self) -> str:
        """Gets the custom_field of this MultipleCustomFieldValuesUpdate.

        The ID or key of the custom field. For example, `customfield_10010`.  # noqa: E501

        :return: The custom_field of this MultipleCustomFieldValuesUpdate.
        :rtype: str
        """
        return self._custom_field

    @custom_field.setter
    def custom_field(self, custom_field: str):
        """Sets the custom_field of this MultipleCustomFieldValuesUpdate.

        The ID or key of the custom field. For example, `customfield_10010`.  # noqa: E501

        :param custom_field: The custom_field of this MultipleCustomFieldValuesUpdate.
        :type custom_field: str
        """
        if custom_field is None:
            raise ValueError("Invalid value for `custom_field`, must not be `None`")  # noqa: E501

        self._custom_field = custom_field

    @property
    def issue_ids(self) -> List[int]:
        """Gets the issue_ids of this MultipleCustomFieldValuesUpdate.

        The list of issue IDs.  # noqa: E501

        :return: The issue_ids of this MultipleCustomFieldValuesUpdate.
        :rtype: List[int]
        """
        return self._issue_ids

    @issue_ids.setter
    def issue_ids(self, issue_ids: List[int]):
        """Sets the issue_ids of this MultipleCustomFieldValuesUpdate.

        The list of issue IDs.  # noqa: E501

        :param issue_ids: The issue_ids of this MultipleCustomFieldValuesUpdate.
        :type issue_ids: List[int]
        """
        if issue_ids is None:
            raise ValueError("Invalid value for `issue_ids`, must not be `None`")  # noqa: E501

        self._issue_ids = issue_ids

    @property
    def value(self) -> object:
        """Gets the value of this MultipleCustomFieldValuesUpdate.

        The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:   *  `string` the value must be a string.  *  `number` the value must be a number.  *  `datetime` the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, `\"2023-01-18T12:00:00-03:00\"` or `\"2023-01-18T12:00:00.000Z\"`. However, the milliseconds part is ignored.  *  `user` the value must be an object that contains the `accountId` field.  *  `group` the value must be an object that contains the group `name` or `groupId` field. Because group names can change, we recommend using `groupId`.  A list of appropriate values must be provided if the field is of the `list` [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).  # noqa: E501

        :return: The value of this MultipleCustomFieldValuesUpdate.
        :rtype: object
        """
        return self._value

    @value.setter
    def value(self, value: object):
        """Sets the value of this MultipleCustomFieldValuesUpdate.

        The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:   *  `string` the value must be a string.  *  `number` the value must be a number.  *  `datetime` the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, `\"2023-01-18T12:00:00-03:00\"` or `\"2023-01-18T12:00:00.000Z\"`. However, the milliseconds part is ignored.  *  `user` the value must be an object that contains the `accountId` field.  *  `group` the value must be an object that contains the group `name` or `groupId` field. Because group names can change, we recommend using `groupId`.  A list of appropriate values must be provided if the field is of the `list` [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).  # noqa: E501

        :param value: The value of this MultipleCustomFieldValuesUpdate.
        :type value: object
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value