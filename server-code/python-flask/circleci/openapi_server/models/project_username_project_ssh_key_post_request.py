from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProjectUsernameProjectSshKeyPostRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, hostname=None, private_key=None):  # noqa: E501
        """ProjectUsernameProjectSshKeyPostRequest - a model defined in OpenAPI

        :param hostname: The hostname of this ProjectUsernameProjectSshKeyPostRequest.  # noqa: E501
        :type hostname: str
        :param private_key: The private_key of this ProjectUsernameProjectSshKeyPostRequest.  # noqa: E501
        :type private_key: str
        """
        self.openapi_types = {
            'hostname': str,
            'private_key': str
        }

        self.attribute_map = {
            'hostname': 'hostname',
            'private_key': 'private_key'
        }

        self._hostname = hostname
        self._private_key = private_key

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectUsernameProjectSshKeyPostRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _project__username___project__ssh_key_post_request of this ProjectUsernameProjectSshKeyPostRequest.  # noqa: E501
        :rtype: ProjectUsernameProjectSshKeyPostRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def hostname(self) -> str:
        """Gets the hostname of this ProjectUsernameProjectSshKeyPostRequest.


        :return: The hostname of this ProjectUsernameProjectSshKeyPostRequest.
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname: str):
        """Sets the hostname of this ProjectUsernameProjectSshKeyPostRequest.


        :param hostname: The hostname of this ProjectUsernameProjectSshKeyPostRequest.
        :type hostname: str
        """

        self._hostname = hostname

    @property
    def private_key(self) -> str:
        """Gets the private_key of this ProjectUsernameProjectSshKeyPostRequest.


        :return: The private_key of this ProjectUsernameProjectSshKeyPostRequest.
        :rtype: str
        """
        return self._private_key

    @private_key.setter
    def private_key(self, private_key: str):
        """Sets the private_key of this ProjectUsernameProjectSshKeyPostRequest.


        :param private_key: The private_key of this ProjectUsernameProjectSshKeyPostRequest.
        :type private_key: str
        """

        self._private_key = private_key
