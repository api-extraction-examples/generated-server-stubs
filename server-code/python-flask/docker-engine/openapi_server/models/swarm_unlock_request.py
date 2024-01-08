from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SwarmUnlockRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, unlock_key=None):  # noqa: E501
        """SwarmUnlockRequest - a model defined in OpenAPI

        :param unlock_key: The unlock_key of this SwarmUnlockRequest.  # noqa: E501
        :type unlock_key: str
        """
        self.openapi_types = {
            'unlock_key': str
        }

        self.attribute_map = {
            'unlock_key': 'UnlockKey'
        }

        self._unlock_key = unlock_key

    @classmethod
    def from_dict(cls, dikt) -> 'SwarmUnlockRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SwarmUnlock_request of this SwarmUnlockRequest.  # noqa: E501
        :rtype: SwarmUnlockRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def unlock_key(self) -> str:
        """Gets the unlock_key of this SwarmUnlockRequest.

        The swarm's unlock key.  # noqa: E501

        :return: The unlock_key of this SwarmUnlockRequest.
        :rtype: str
        """
        return self._unlock_key

    @unlock_key.setter
    def unlock_key(self, unlock_key: str):
        """Sets the unlock_key of this SwarmUnlockRequest.

        The swarm's unlock key.  # noqa: E501

        :param unlock_key: The unlock_key of this SwarmUnlockRequest.
        :type unlock_key: str
        """

        self._unlock_key = unlock_key