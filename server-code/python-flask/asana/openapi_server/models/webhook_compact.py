from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.asana_named_resource import AsanaNamedResource
from openapi_server import util

from openapi_server.models.asana_named_resource import AsanaNamedResource  # noqa: E501

class WebhookCompact(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, active=None, resource=None, target=None):  # noqa: E501
        """WebhookCompact - a model defined in OpenAPI

        :param gid: The gid of this WebhookCompact.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this WebhookCompact.  # noqa: E501
        :type resource_type: str
        :param active: The active of this WebhookCompact.  # noqa: E501
        :type active: bool
        :param resource: The resource of this WebhookCompact.  # noqa: E501
        :type resource: AsanaNamedResource
        :param target: The target of this WebhookCompact.  # noqa: E501
        :type target: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'active': bool,
            'resource': AsanaNamedResource,
            'target': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'active': 'active',
            'resource': 'resource',
            'target': 'target'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._active = active
        self._resource = resource
        self._target = target

    @classmethod
    def from_dict(cls, dikt) -> 'WebhookCompact':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WebhookCompact of this WebhookCompact.  # noqa: E501
        :rtype: WebhookCompact
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this WebhookCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this WebhookCompact.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this WebhookCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this WebhookCompact.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this WebhookCompact.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this WebhookCompact.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this WebhookCompact.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this WebhookCompact.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def active(self) -> bool:
        """Gets the active of this WebhookCompact.

        If true, the webhook will send events - if false it is considered inactive and will not generate events.  # noqa: E501

        :return: The active of this WebhookCompact.
        :rtype: bool
        """
        return self._active

    @active.setter
    def active(self, active: bool):
        """Sets the active of this WebhookCompact.

        If true, the webhook will send events - if false it is considered inactive and will not generate events.  # noqa: E501

        :param active: The active of this WebhookCompact.
        :type active: bool
        """

        self._active = active

    @property
    def resource(self) -> AsanaNamedResource:
        """Gets the resource of this WebhookCompact.


        :return: The resource of this WebhookCompact.
        :rtype: AsanaNamedResource
        """
        return self._resource

    @resource.setter
    def resource(self, resource: AsanaNamedResource):
        """Sets the resource of this WebhookCompact.


        :param resource: The resource of this WebhookCompact.
        :type resource: AsanaNamedResource
        """

        self._resource = resource

    @property
    def target(self) -> str:
        """Gets the target of this WebhookCompact.

        The URL to receive the HTTP POST.  # noqa: E501

        :return: The target of this WebhookCompact.
        :rtype: str
        """
        return self._target

    @target.setter
    def target(self, target: str):
        """Sets the target of this WebhookCompact.

        The URL to receive the HTTP POST.  # noqa: E501

        :param target: The target of this WebhookCompact.
        :type target: str
        """

        self._target = target
