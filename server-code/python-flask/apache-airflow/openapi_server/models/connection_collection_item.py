from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ConnectionCollectionItem(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, conn_type=None, connection_id=None, description=None, host=None, login=None, port=None, _schema=None):  # noqa: E501
        """ConnectionCollectionItem - a model defined in OpenAPI

        :param conn_type: The conn_type of this ConnectionCollectionItem.  # noqa: E501
        :type conn_type: str
        :param connection_id: The connection_id of this ConnectionCollectionItem.  # noqa: E501
        :type connection_id: str
        :param description: The description of this ConnectionCollectionItem.  # noqa: E501
        :type description: str
        :param host: The host of this ConnectionCollectionItem.  # noqa: E501
        :type host: str
        :param login: The login of this ConnectionCollectionItem.  # noqa: E501
        :type login: str
        :param port: The port of this ConnectionCollectionItem.  # noqa: E501
        :type port: int
        :param _schema: The _schema of this ConnectionCollectionItem.  # noqa: E501
        :type _schema: str
        """
        self.openapi_types = {
            'conn_type': str,
            'connection_id': str,
            'description': str,
            'host': str,
            'login': str,
            'port': int,
            '_schema': str
        }

        self.attribute_map = {
            'conn_type': 'conn_type',
            'connection_id': 'connection_id',
            'description': 'description',
            'host': 'host',
            'login': 'login',
            'port': 'port',
            '_schema': 'schema'
        }

        self._conn_type = conn_type
        self._connection_id = connection_id
        self._description = description
        self._host = host
        self._login = login
        self._port = port
        self.__schema = _schema

    @classmethod
    def from_dict(cls, dikt) -> 'ConnectionCollectionItem':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ConnectionCollectionItem of this ConnectionCollectionItem.  # noqa: E501
        :rtype: ConnectionCollectionItem
        """
        return util.deserialize_model(dikt, cls)

    @property
    def conn_type(self) -> str:
        """Gets the conn_type of this ConnectionCollectionItem.

        The connection type.  # noqa: E501

        :return: The conn_type of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._conn_type

    @conn_type.setter
    def conn_type(self, conn_type: str):
        """Sets the conn_type of this ConnectionCollectionItem.

        The connection type.  # noqa: E501

        :param conn_type: The conn_type of this ConnectionCollectionItem.
        :type conn_type: str
        """

        self._conn_type = conn_type

    @property
    def connection_id(self) -> str:
        """Gets the connection_id of this ConnectionCollectionItem.

        The connection ID.  # noqa: E501

        :return: The connection_id of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._connection_id

    @connection_id.setter
    def connection_id(self, connection_id: str):
        """Sets the connection_id of this ConnectionCollectionItem.

        The connection ID.  # noqa: E501

        :param connection_id: The connection_id of this ConnectionCollectionItem.
        :type connection_id: str
        """

        self._connection_id = connection_id

    @property
    def description(self) -> str:
        """Gets the description of this ConnectionCollectionItem.

        The description of the connection.  # noqa: E501

        :return: The description of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ConnectionCollectionItem.

        The description of the connection.  # noqa: E501

        :param description: The description of this ConnectionCollectionItem.
        :type description: str
        """

        self._description = description

    @property
    def host(self) -> str:
        """Gets the host of this ConnectionCollectionItem.

        Host of the connection.  # noqa: E501

        :return: The host of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._host

    @host.setter
    def host(self, host: str):
        """Sets the host of this ConnectionCollectionItem.

        Host of the connection.  # noqa: E501

        :param host: The host of this ConnectionCollectionItem.
        :type host: str
        """

        self._host = host

    @property
    def login(self) -> str:
        """Gets the login of this ConnectionCollectionItem.

        Login of the connection.  # noqa: E501

        :return: The login of this ConnectionCollectionItem.
        :rtype: str
        """
        return self._login

    @login.setter
    def login(self, login: str):
        """Sets the login of this ConnectionCollectionItem.

        Login of the connection.  # noqa: E501

        :param login: The login of this ConnectionCollectionItem.
        :type login: str
        """

        self._login = login

    @property
    def port(self) -> int:
        """Gets the port of this ConnectionCollectionItem.

        Port of the connection.  # noqa: E501

        :return: The port of this ConnectionCollectionItem.
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port: int):
        """Sets the port of this ConnectionCollectionItem.

        Port of the connection.  # noqa: E501

        :param port: The port of this ConnectionCollectionItem.
        :type port: int
        """

        self._port = port

    @property
    def _schema(self) -> str:
        """Gets the _schema of this ConnectionCollectionItem.

        Schema of the connection.  # noqa: E501

        :return: The _schema of this ConnectionCollectionItem.
        :rtype: str
        """
        return self.__schema

    @_schema.setter
    def _schema(self, _schema: str):
        """Sets the _schema of this ConnectionCollectionItem.

        Schema of the connection.  # noqa: E501

        :param _schema: The _schema of this ConnectionCollectionItem.
        :type _schema: str
        """

        self.__schema = _schema
