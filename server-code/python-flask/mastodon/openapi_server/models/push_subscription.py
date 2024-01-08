from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PushSubscription(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, alerts=None, endpoint=None, id=None, server_key=None):  # noqa: E501
        """PushSubscription - a model defined in OpenAPI

        :param alerts: The alerts of this PushSubscription.  # noqa: E501
        :type alerts: object
        :param endpoint: The endpoint of this PushSubscription.  # noqa: E501
        :type endpoint: str
        :param id: The id of this PushSubscription.  # noqa: E501
        :type id: str
        :param server_key: The server_key of this PushSubscription.  # noqa: E501
        :type server_key: str
        """
        self.openapi_types = {
            'alerts': object,
            'endpoint': str,
            'id': str,
            'server_key': str
        }

        self.attribute_map = {
            'alerts': 'alerts',
            'endpoint': 'endpoint',
            'id': 'id',
            'server_key': 'server_key'
        }

        self._alerts = alerts
        self._endpoint = endpoint
        self._id = id
        self._server_key = server_key

    @classmethod
    def from_dict(cls, dikt) -> 'PushSubscription':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PushSubscription of this PushSubscription.  # noqa: E501
        :rtype: PushSubscription
        """
        return util.deserialize_model(dikt, cls)

    @property
    def alerts(self) -> object:
        """Gets the alerts of this PushSubscription.

        Which alerts should be delivered to the `endpoint`.  # noqa: E501

        :return: The alerts of this PushSubscription.
        :rtype: object
        """
        return self._alerts

    @alerts.setter
    def alerts(self, alerts: object):
        """Sets the alerts of this PushSubscription.

        Which alerts should be delivered to the `endpoint`.  # noqa: E501

        :param alerts: The alerts of this PushSubscription.
        :type alerts: object
        """
        if alerts is None:
            raise ValueError("Invalid value for `alerts`, must not be `None`")  # noqa: E501

        self._alerts = alerts

    @property
    def endpoint(self) -> str:
        """Gets the endpoint of this PushSubscription.

        Where push alerts will be sent to.  # noqa: E501

        :return: The endpoint of this PushSubscription.
        :rtype: str
        """
        return self._endpoint

    @endpoint.setter
    def endpoint(self, endpoint: str):
        """Sets the endpoint of this PushSubscription.

        Where push alerts will be sent to.  # noqa: E501

        :param endpoint: The endpoint of this PushSubscription.
        :type endpoint: str
        """
        if endpoint is None:
            raise ValueError("Invalid value for `endpoint`, must not be `None`")  # noqa: E501

        self._endpoint = endpoint

    @property
    def id(self) -> str:
        """Gets the id of this PushSubscription.

        The ID of the push subscription in the database. Cast from an integer, but not guaranteed to be a number.  # noqa: E501

        :return: The id of this PushSubscription.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this PushSubscription.

        The ID of the push subscription in the database. Cast from an integer, but not guaranteed to be a number.  # noqa: E501

        :param id: The id of this PushSubscription.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def server_key(self) -> str:
        """Gets the server_key of this PushSubscription.

        The streaming server's VAPID key.  # noqa: E501

        :return: The server_key of this PushSubscription.
        :rtype: str
        """
        return self._server_key

    @server_key.setter
    def server_key(self, server_key: str):
        """Sets the server_key of this PushSubscription.

        The streaming server's VAPID key.  # noqa: E501

        :param server_key: The server_key of this PushSubscription.
        :type server_key: str
        """
        if server_key is None:
            raise ValueError("Invalid value for `server_key`, must not be `None`")  # noqa: E501

        self._server_key = server_key
