from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SwarmSpecEncryptionConfig(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, auto_lock_managers=None):  # noqa: E501
        """SwarmSpecEncryptionConfig - a model defined in OpenAPI

        :param auto_lock_managers: The auto_lock_managers of this SwarmSpecEncryptionConfig.  # noqa: E501
        :type auto_lock_managers: bool
        """
        self.openapi_types = {
            'auto_lock_managers': bool
        }

        self.attribute_map = {
            'auto_lock_managers': 'AutoLockManagers'
        }

        self._auto_lock_managers = auto_lock_managers

    @classmethod
    def from_dict(cls, dikt) -> 'SwarmSpecEncryptionConfig':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SwarmSpec_EncryptionConfig of this SwarmSpecEncryptionConfig.  # noqa: E501
        :rtype: SwarmSpecEncryptionConfig
        """
        return util.deserialize_model(dikt, cls)

    @property
    def auto_lock_managers(self) -> bool:
        """Gets the auto_lock_managers of this SwarmSpecEncryptionConfig.

        If set, generate a key and use it to lock data stored on the managers.  # noqa: E501

        :return: The auto_lock_managers of this SwarmSpecEncryptionConfig.
        :rtype: bool
        """
        return self._auto_lock_managers

    @auto_lock_managers.setter
    def auto_lock_managers(self, auto_lock_managers: bool):
        """Sets the auto_lock_managers of this SwarmSpecEncryptionConfig.

        If set, generate a key and use it to lock data stored on the managers.  # noqa: E501

        :param auto_lock_managers: The auto_lock_managers of this SwarmSpecEncryptionConfig.
        :type auto_lock_managers: bool
        """

        self._auto_lock_managers = auto_lock_managers