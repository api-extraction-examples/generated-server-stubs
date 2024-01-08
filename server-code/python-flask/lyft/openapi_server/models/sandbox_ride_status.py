from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.ride_status_enum import RideStatusEnum
from openapi_server import util

from openapi_server.models.ride_status_enum import RideStatusEnum  # noqa: E501

class SandboxRideStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None):  # noqa: E501
        """SandboxRideStatus - a model defined in OpenAPI

        :param status: The status of this SandboxRideStatus.  # noqa: E501
        :type status: RideStatusEnum
        """
        self.openapi_types = {
            'status': RideStatusEnum
        }

        self.attribute_map = {
            'status': 'status'
        }

        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'SandboxRideStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SandboxRideStatus of this SandboxRideStatus.  # noqa: E501
        :rtype: SandboxRideStatus
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self) -> RideStatusEnum:
        """Gets the status of this SandboxRideStatus.


        :return: The status of this SandboxRideStatus.
        :rtype: RideStatusEnum
        """
        return self._status

    @status.setter
    def status(self, status: RideStatusEnum):
        """Sets the status of this SandboxRideStatus.


        :param status: The status of this SandboxRideStatus.
        :type status: RideStatusEnum
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status
