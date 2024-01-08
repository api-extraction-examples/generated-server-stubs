from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.health_status import HealthStatus
from openapi_server import util

from openapi_server.models.health_status import HealthStatus  # noqa: E501

class MetadatabaseStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None):  # noqa: E501
        """MetadatabaseStatus - a model defined in OpenAPI

        :param status: The status of this MetadatabaseStatus.  # noqa: E501
        :type status: HealthStatus
        """
        self.openapi_types = {
            'status': HealthStatus
        }

        self.attribute_map = {
            'status': 'status'
        }

        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'MetadatabaseStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MetadatabaseStatus of this MetadatabaseStatus.  # noqa: E501
        :rtype: MetadatabaseStatus
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> HealthStatus:
        """Gets the status of this MetadatabaseStatus.


        :return: The status of this MetadatabaseStatus.
        :rtype: HealthStatus
        """
        return self._status

    @status.setter
    def status(self, status: HealthStatus):
        """Sets the status of this MetadatabaseStatus.


        :param status: The status of this MetadatabaseStatus.
        :type status: HealthStatus
        """

        self._status = status