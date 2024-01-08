from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.audit_log_event_actor import AuditLogEventActor
from openapi_server.models.audit_log_event_context import AuditLogEventContext
from openapi_server.models.audit_log_event_resource import AuditLogEventResource
from openapi_server import util

from openapi_server.models.audit_log_event_actor import AuditLogEventActor  # noqa: E501
from openapi_server.models.audit_log_event_context import AuditLogEventContext  # noqa: E501
from openapi_server.models.audit_log_event_resource import AuditLogEventResource  # noqa: E501

class AuditLogEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, actor=None, context=None, created_at=None, details=None, event_category=None, event_type=None, gid=None, resource=None):  # noqa: E501
        """AuditLogEvent - a model defined in OpenAPI

        :param actor: The actor of this AuditLogEvent.  # noqa: E501
        :type actor: AuditLogEventActor
        :param context: The context of this AuditLogEvent.  # noqa: E501
        :type context: AuditLogEventContext
        :param created_at: The created_at of this AuditLogEvent.  # noqa: E501
        :type created_at: datetime
        :param details: The details of this AuditLogEvent.  # noqa: E501
        :type details: object
        :param event_category: The event_category of this AuditLogEvent.  # noqa: E501
        :type event_category: str
        :param event_type: The event_type of this AuditLogEvent.  # noqa: E501
        :type event_type: str
        :param gid: The gid of this AuditLogEvent.  # noqa: E501
        :type gid: str
        :param resource: The resource of this AuditLogEvent.  # noqa: E501
        :type resource: AuditLogEventResource
        """
        self.openapi_types = {
            'actor': AuditLogEventActor,
            'context': AuditLogEventContext,
            'created_at': datetime,
            'details': object,
            'event_category': str,
            'event_type': str,
            'gid': str,
            'resource': AuditLogEventResource
        }

        self.attribute_map = {
            'actor': 'actor',
            'context': 'context',
            'created_at': 'created_at',
            'details': 'details',
            'event_category': 'event_category',
            'event_type': 'event_type',
            'gid': 'gid',
            'resource': 'resource'
        }

        self._actor = actor
        self._context = context
        self._created_at = created_at
        self._details = details
        self._event_category = event_category
        self._event_type = event_type
        self._gid = gid
        self._resource = resource

    @classmethod
    def from_dict(cls, dikt) -> 'AuditLogEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AuditLogEvent of this AuditLogEvent.  # noqa: E501
        :rtype: AuditLogEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def actor(self) -> AuditLogEventActor:
        """Gets the actor of this AuditLogEvent.


        :return: The actor of this AuditLogEvent.
        :rtype: AuditLogEventActor
        """
        return self._actor

    @actor.setter
    def actor(self, actor: AuditLogEventActor):
        """Sets the actor of this AuditLogEvent.


        :param actor: The actor of this AuditLogEvent.
        :type actor: AuditLogEventActor
        """

        self._actor = actor

    @property
    def context(self) -> AuditLogEventContext:
        """Gets the context of this AuditLogEvent.


        :return: The context of this AuditLogEvent.
        :rtype: AuditLogEventContext
        """
        return self._context

    @context.setter
    def context(self, context: AuditLogEventContext):
        """Sets the context of this AuditLogEvent.


        :param context: The context of this AuditLogEvent.
        :type context: AuditLogEventContext
        """

        self._context = context

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this AuditLogEvent.

        The time the event was created.  # noqa: E501

        :return: The created_at of this AuditLogEvent.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this AuditLogEvent.

        The time the event was created.  # noqa: E501

        :param created_at: The created_at of this AuditLogEvent.
        :type created_at: datetime
        """

        self._created_at = created_at

    @property
    def details(self) -> object:
        """Gets the details of this AuditLogEvent.

        Event specific details. The schema will vary depending on the `event_type`.  # noqa: E501

        :return: The details of this AuditLogEvent.
        :rtype: object
        """
        return self._details

    @details.setter
    def details(self, details: object):
        """Sets the details of this AuditLogEvent.

        Event specific details. The schema will vary depending on the `event_type`.  # noqa: E501

        :param details: The details of this AuditLogEvent.
        :type details: object
        """

        self._details = details

    @property
    def event_category(self) -> str:
        """Gets the event_category of this AuditLogEvent.

        The category that this `event_type` belongs to.  # noqa: E501

        :return: The event_category of this AuditLogEvent.
        :rtype: str
        """
        return self._event_category

    @event_category.setter
    def event_category(self, event_category: str):
        """Sets the event_category of this AuditLogEvent.

        The category that this `event_type` belongs to.  # noqa: E501

        :param event_category: The event_category of this AuditLogEvent.
        :type event_category: str
        """

        self._event_category = event_category

    @property
    def event_type(self) -> str:
        """Gets the event_type of this AuditLogEvent.

        The type of the event.  # noqa: E501

        :return: The event_type of this AuditLogEvent.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type: str):
        """Sets the event_type of this AuditLogEvent.

        The type of the event.  # noqa: E501

        :param event_type: The event_type of this AuditLogEvent.
        :type event_type: str
        """

        self._event_type = event_type

    @property
    def gid(self) -> str:
        """Gets the gid of this AuditLogEvent.

        Globally unique identifier of the `AuditLogEvent`, as a string.  # noqa: E501

        :return: The gid of this AuditLogEvent.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this AuditLogEvent.

        Globally unique identifier of the `AuditLogEvent`, as a string.  # noqa: E501

        :param gid: The gid of this AuditLogEvent.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource(self) -> AuditLogEventResource:
        """Gets the resource of this AuditLogEvent.


        :return: The resource of this AuditLogEvent.
        :rtype: AuditLogEventResource
        """
        return self._resource

    @resource.setter
    def resource(self, resource: AuditLogEventResource):
        """Sets the resource of this AuditLogEvent.


        :param resource: The resource of this AuditLogEvent.
        :type resource: AuditLogEventResource
        """

        self._resource = resource
