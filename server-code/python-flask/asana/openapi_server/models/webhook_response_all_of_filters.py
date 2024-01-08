from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class WebhookResponseAllOfFilters(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, action=None, fields=None, resource_subtype=None, resource_type=None):  # noqa: E501
        """WebhookResponseAllOfFilters - a model defined in OpenAPI

        :param action: The action of this WebhookResponseAllOfFilters.  # noqa: E501
        :type action: str
        :param fields: The fields of this WebhookResponseAllOfFilters.  # noqa: E501
        :type fields: List[str]
        :param resource_subtype: The resource_subtype of this WebhookResponseAllOfFilters.  # noqa: E501
        :type resource_subtype: str
        :param resource_type: The resource_type of this WebhookResponseAllOfFilters.  # noqa: E501
        :type resource_type: str
        """
        self.openapi_types = {
            'action': str,
            'fields': List[str],
            'resource_subtype': str,
            'resource_type': str
        }

        self.attribute_map = {
            'action': 'action',
            'fields': 'fields',
            'resource_subtype': 'resource_subtype',
            'resource_type': 'resource_type'
        }

        self._action = action
        self._fields = fields
        self._resource_subtype = resource_subtype
        self._resource_type = resource_type

    @classmethod
    def from_dict(cls, dikt) -> 'WebhookResponseAllOfFilters':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WebhookResponse_allOf_filters of this WebhookResponseAllOfFilters.  # noqa: E501
        :rtype: WebhookResponseAllOfFilters
        """
        return util.deserialize_model(dikt, cls)

    @property
    def action(self) -> str:
        """Gets the action of this WebhookResponseAllOfFilters.

        The type of change on the **resource** to pass through the filter. For more information refer to `Event.action` in the [Event](/docs/tocS_Event) schema. This can be one of `changed`, `added`, `removed`, `deleted`, and `undeleted` depending on the nature of what has occurred on the resource.  # noqa: E501

        :return: The action of this WebhookResponseAllOfFilters.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action: str):
        """Sets the action of this WebhookResponseAllOfFilters.

        The type of change on the **resource** to pass through the filter. For more information refer to `Event.action` in the [Event](/docs/tocS_Event) schema. This can be one of `changed`, `added`, `removed`, `deleted`, and `undeleted` depending on the nature of what has occurred on the resource.  # noqa: E501

        :param action: The action of this WebhookResponseAllOfFilters.
        :type action: str
        """

        self._action = action

    @property
    def fields(self) -> List[str]:
        """Gets the fields of this WebhookResponseAllOfFilters.

        *Conditional.* A whitelist of fields for events which will pass the filter when the resource is changed. These can be any combination of the fields on the resources themselves. This field is only valid for `action` of type `changed`  # noqa: E501

        :return: The fields of this WebhookResponseAllOfFilters.
        :rtype: List[str]
        """
        return self._fields

    @fields.setter
    def fields(self, fields: List[str]):
        """Sets the fields of this WebhookResponseAllOfFilters.

        *Conditional.* A whitelist of fields for events which will pass the filter when the resource is changed. These can be any combination of the fields on the resources themselves. This field is only valid for `action` of type `changed`  # noqa: E501

        :param fields: The fields of this WebhookResponseAllOfFilters.
        :type fields: List[str]
        """

        self._fields = fields

    @property
    def resource_subtype(self) -> str:
        """Gets the resource_subtype of this WebhookResponseAllOfFilters.

        The resource subtype of the resource that the filter applies to. This should be set to the same value as is returned on the `resource_subtype` field on the resources themselves.  # noqa: E501

        :return: The resource_subtype of this WebhookResponseAllOfFilters.
        :rtype: str
        """
        return self._resource_subtype

    @resource_subtype.setter
    def resource_subtype(self, resource_subtype: str):
        """Sets the resource_subtype of this WebhookResponseAllOfFilters.

        The resource subtype of the resource that the filter applies to. This should be set to the same value as is returned on the `resource_subtype` field on the resources themselves.  # noqa: E501

        :param resource_subtype: The resource_subtype of this WebhookResponseAllOfFilters.
        :type resource_subtype: str
        """

        self._resource_subtype = resource_subtype

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this WebhookResponseAllOfFilters.

        The type of the resource which created the event when modified; for example, to filter to changes on regular tasks this field should be set to `task`.  # noqa: E501

        :return: The resource_type of this WebhookResponseAllOfFilters.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this WebhookResponseAllOfFilters.

        The type of the resource which created the event when modified; for example, to filter to changes on regular tasks this field should be set to `task`.  # noqa: E501

        :param resource_type: The resource_type of this WebhookResponseAllOfFilters.
        :type resource_type: str
        """

        self._resource_type = resource_type
