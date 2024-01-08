from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.event_response_change import EventResponseChange
from openapi_server.models.event_response_parent import EventResponseParent
from openapi_server.models.event_response_resource import EventResponseResource
from openapi_server.models.event_response_user import EventResponseUser
from openapi_server import util

from openapi_server.models.event_response_change import EventResponseChange  # noqa: E501
from openapi_server.models.event_response_parent import EventResponseParent  # noqa: E501
from openapi_server.models.event_response_resource import EventResponseResource  # noqa: E501
from openapi_server.models.event_response_user import EventResponseUser  # noqa: E501

class EventResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, action=None, change=None, created_at=None, parent=None, resource=None, type=None, user=None):  # noqa: E501
        """EventResponse - a model defined in OpenAPI

        :param action: The action of this EventResponse.  # noqa: E501
        :type action: str
        :param change: The change of this EventResponse.  # noqa: E501
        :type change: EventResponseChange
        :param created_at: The created_at of this EventResponse.  # noqa: E501
        :type created_at: datetime
        :param parent: The parent of this EventResponse.  # noqa: E501
        :type parent: EventResponseParent
        :param resource: The resource of this EventResponse.  # noqa: E501
        :type resource: EventResponseResource
        :param type: The type of this EventResponse.  # noqa: E501
        :type type: str
        :param user: The user of this EventResponse.  # noqa: E501
        :type user: EventResponseUser
        """
        self.openapi_types = {
            'action': str,
            'change': EventResponseChange,
            'created_at': datetime,
            'parent': EventResponseParent,
            'resource': EventResponseResource,
            'type': str,
            'user': EventResponseUser
        }

        self.attribute_map = {
            'action': 'action',
            'change': 'change',
            'created_at': 'created_at',
            'parent': 'parent',
            'resource': 'resource',
            'type': 'type',
            'user': 'user'
        }

        self._action = action
        self._change = change
        self._created_at = created_at
        self._parent = parent
        self._resource = resource
        self._type = type
        self._user = user

    @classmethod
    def from_dict(cls, dikt) -> 'EventResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EventResponse of this EventResponse.  # noqa: E501
        :rtype: EventResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def action(self) -> str:
        """Gets the action of this EventResponse.

        The type of action taken on the **resource** that triggered the event.  This can be one of `changed`, `added`, `removed`, `deleted`, or `undeleted` depending on the nature of the event.  # noqa: E501

        :return: The action of this EventResponse.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action: str):
        """Sets the action of this EventResponse.

        The type of action taken on the **resource** that triggered the event.  This can be one of `changed`, `added`, `removed`, `deleted`, or `undeleted` depending on the nature of the event.  # noqa: E501

        :param action: The action of this EventResponse.
        :type action: str
        """

        self._action = action

    @property
    def change(self) -> EventResponseChange:
        """Gets the change of this EventResponse.


        :return: The change of this EventResponse.
        :rtype: EventResponseChange
        """
        return self._change

    @change.setter
    def change(self, change: EventResponseChange):
        """Sets the change of this EventResponse.


        :param change: The change of this EventResponse.
        :type change: EventResponseChange
        """

        self._change = change

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this EventResponse.

        The timestamp when the event occurred.  # noqa: E501

        :return: The created_at of this EventResponse.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this EventResponse.

        The timestamp when the event occurred.  # noqa: E501

        :param created_at: The created_at of this EventResponse.
        :type created_at: datetime
        """

        self._created_at = created_at

    @property
    def parent(self) -> EventResponseParent:
        """Gets the parent of this EventResponse.


        :return: The parent of this EventResponse.
        :rtype: EventResponseParent
        """
        return self._parent

    @parent.setter
    def parent(self, parent: EventResponseParent):
        """Sets the parent of this EventResponse.


        :param parent: The parent of this EventResponse.
        :type parent: EventResponseParent
        """

        self._parent = parent

    @property
    def resource(self) -> EventResponseResource:
        """Gets the resource of this EventResponse.


        :return: The resource of this EventResponse.
        :rtype: EventResponseResource
        """
        return self._resource

    @resource.setter
    def resource(self, resource: EventResponseResource):
        """Sets the resource of this EventResponse.


        :param resource: The resource of this EventResponse.
        :type resource: EventResponseResource
        """

        self._resource = resource

    @property
    def type(self) -> str:
        """Gets the type of this EventResponse.

        *Deprecated: Refer to the resource_type of the resource.* The type of the resource that generated the event.  # noqa: E501

        :return: The type of this EventResponse.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this EventResponse.

        *Deprecated: Refer to the resource_type of the resource.* The type of the resource that generated the event.  # noqa: E501

        :param type: The type of this EventResponse.
        :type type: str
        """

        self._type = type

    @property
    def user(self) -> EventResponseUser:
        """Gets the user of this EventResponse.


        :return: The user of this EventResponse.
        :rtype: EventResponseUser
        """
        return self._user

    @user.setter
    def user(self, user: EventResponseUser):
        """Sets the user of this EventResponse.


        :param user: The user of this EventResponse.
        :type user: EventResponseUser
        """

        self._user = user
