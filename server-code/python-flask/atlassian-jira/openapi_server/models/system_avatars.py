from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.avatar import Avatar
from openapi_server import util

from openapi_server.models.avatar import Avatar  # noqa: E501

class SystemAvatars(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, system=None):  # noqa: E501
        """SystemAvatars - a model defined in OpenAPI

        :param system: The system of this SystemAvatars.  # noqa: E501
        :type system: List[Avatar]
        """
        self.openapi_types = {
            'system': List[Avatar]
        }

        self.attribute_map = {
            'system': 'system'
        }

        self._system = system

    @classmethod
    def from_dict(cls, dikt) -> 'SystemAvatars':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SystemAvatars of this SystemAvatars.  # noqa: E501
        :rtype: SystemAvatars
        """
        return util.deserialize_model(dikt, cls)

    @property
    def system(self) -> List[Avatar]:
        """Gets the system of this SystemAvatars.

        A list of avatar details.  # noqa: E501

        :return: The system of this SystemAvatars.
        :rtype: List[Avatar]
        """
        return self._system

    @system.setter
    def system(self, system: List[Avatar]):
        """Sets the system of this SystemAvatars.

        A list of avatar details.  # noqa: E501

        :param system: The system of this SystemAvatars.
        :type system: List[Avatar]
        """

        self._system = system