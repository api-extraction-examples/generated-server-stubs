from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SystemAuth200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, identity_token=None, status=None):  # noqa: E501
        """SystemAuth200Response - a model defined in OpenAPI

        :param identity_token: The identity_token of this SystemAuth200Response.  # noqa: E501
        :type identity_token: str
        :param status: The status of this SystemAuth200Response.  # noqa: E501
        :type status: str
        """
        self.openapi_types = {
            'identity_token': str,
            'status': str
        }

        self.attribute_map = {
            'identity_token': 'IdentityToken',
            'status': 'Status'
        }

        self._identity_token = identity_token
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'SystemAuth200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SystemAuth_200_response of this SystemAuth200Response.  # noqa: E501
        :rtype: SystemAuth200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def identity_token(self) -> str:
        """Gets the identity_token of this SystemAuth200Response.

        An opaque token used to authenticate a user after a successful login  # noqa: E501

        :return: The identity_token of this SystemAuth200Response.
        :rtype: str
        """
        return self._identity_token

    @identity_token.setter
    def identity_token(self, identity_token: str):
        """Sets the identity_token of this SystemAuth200Response.

        An opaque token used to authenticate a user after a successful login  # noqa: E501

        :param identity_token: The identity_token of this SystemAuth200Response.
        :type identity_token: str
        """

        self._identity_token = identity_token

    @property
    def status(self) -> str:
        """Gets the status of this SystemAuth200Response.

        The status of the authentication  # noqa: E501

        :return: The status of this SystemAuth200Response.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this SystemAuth200Response.

        The status of the authentication  # noqa: E501

        :param status: The status of this SystemAuth200Response.
        :type status: str
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status
