from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Application(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, client_id=None, client_secret=None, name=None, vapid_key=None, website=None):  # noqa: E501
        """Application - a model defined in OpenAPI

        :param client_id: The client_id of this Application.  # noqa: E501
        :type client_id: str
        :param client_secret: The client_secret of this Application.  # noqa: E501
        :type client_secret: str
        :param name: The name of this Application.  # noqa: E501
        :type name: str
        :param vapid_key: The vapid_key of this Application.  # noqa: E501
        :type vapid_key: str
        :param website: The website of this Application.  # noqa: E501
        :type website: str
        """
        self.openapi_types = {
            'client_id': str,
            'client_secret': str,
            'name': str,
            'vapid_key': str,
            'website': str
        }

        self.attribute_map = {
            'client_id': 'client_id',
            'client_secret': 'client_secret',
            'name': 'name',
            'vapid_key': 'vapid_key',
            'website': 'website'
        }

        self._client_id = client_id
        self._client_secret = client_secret
        self._name = name
        self._vapid_key = vapid_key
        self._website = website

    @classmethod
    def from_dict(cls, dikt) -> 'Application':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Application of this Application.  # noqa: E501
        :rtype: Application
        """
        return util.deserialize_model(dikt, cls)

    @property
    def client_id(self) -> str:
        """Gets the client_id of this Application.

        Client ID key, to be used for obtaining OAuth tokens  # noqa: E501

        :return: The client_id of this Application.
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id: str):
        """Sets the client_id of this Application.

        Client ID key, to be used for obtaining OAuth tokens  # noqa: E501

        :param client_id: The client_id of this Application.
        :type client_id: str
        """

        self._client_id = client_id

    @property
    def client_secret(self) -> str:
        """Gets the client_secret of this Application.

        Client secret key, to be used for obtaining OAuth tokens  # noqa: E501

        :return: The client_secret of this Application.
        :rtype: str
        """
        return self._client_secret

    @client_secret.setter
    def client_secret(self, client_secret: str):
        """Sets the client_secret of this Application.

        Client secret key, to be used for obtaining OAuth tokens  # noqa: E501

        :param client_secret: The client_secret of this Application.
        :type client_secret: str
        """

        self._client_secret = client_secret

    @property
    def name(self) -> str:
        """Gets the name of this Application.

        The name of your application.  # noqa: E501

        :return: The name of this Application.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Application.

        The name of your application.  # noqa: E501

        :param name: The name of this Application.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def vapid_key(self) -> str:
        """Gets the vapid_key of this Application.

        Used for Push Streaming API. Returned with [POST /api/v1/apps](https://docs.joinmastodon.org/methods/apps/#create-an-application). Equivalent to [PushSubscription#server_key](https://docs.joinmastodon.org/entities/pushsubscription/#server_key)  # noqa: E501

        :return: The vapid_key of this Application.
        :rtype: str
        """
        return self._vapid_key

    @vapid_key.setter
    def vapid_key(self, vapid_key: str):
        """Sets the vapid_key of this Application.

        Used for Push Streaming API. Returned with [POST /api/v1/apps](https://docs.joinmastodon.org/methods/apps/#create-an-application). Equivalent to [PushSubscription#server_key](https://docs.joinmastodon.org/entities/pushsubscription/#server_key)  # noqa: E501

        :param vapid_key: The vapid_key of this Application.
        :type vapid_key: str
        """

        self._vapid_key = vapid_key

    @property
    def website(self) -> str:
        """Gets the website of this Application.

        The website associated with your application. Must be URL.  # noqa: E501

        :return: The website of this Application.
        :rtype: str
        """
        return self._website

    @website.setter
    def website(self, website: str):
        """Sets the website of this Application.

        The website associated with your application. Must be URL.  # noqa: E501

        :param website: The website of this Application.
        :type website: str
        """

        self._website = website
