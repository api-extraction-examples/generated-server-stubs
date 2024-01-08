from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.health_status import HealthStatus
from openapi_server import util

from openapi_server.models.health_status import HealthStatus  # noqa: E501

class Health(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, build_time_stamp=None, githash=None, healths=None, status=None, time_stamp=None):  # noqa: E501
        """Health - a model defined in OpenAPI

        :param build_time_stamp: The build_time_stamp of this Health.  # noqa: E501
        :type build_time_stamp: str
        :param githash: The githash of this Health.  # noqa: E501
        :type githash: str
        :param healths: The healths of this Health.  # noqa: E501
        :type healths: List[HealthStatus]
        :param status: The status of this Health.  # noqa: E501
        :type status: str
        :param time_stamp: The time_stamp of this Health.  # noqa: E501
        :type time_stamp: str
        """
        self.openapi_types = {
            'build_time_stamp': str,
            'githash': str,
            'healths': List[HealthStatus],
            'status': str,
            'time_stamp': str
        }

        self.attribute_map = {
            'build_time_stamp': 'BuildTimeStamp',
            'githash': 'Githash',
            'healths': 'Healths',
            'status': 'Status',
            'time_stamp': 'TimeStamp'
        }

        self._build_time_stamp = build_time_stamp
        self._githash = githash
        self._healths = healths
        self._status = status
        self._time_stamp = time_stamp

    @classmethod
    def from_dict(cls, dikt) -> 'Health':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The health of this Health.  # noqa: E501
        :rtype: Health
        """
        return util.deserialize_model(dikt, cls)

    @property
    def build_time_stamp(self) -> str:
        """Gets the build_time_stamp of this Health.

        Time the service was built and deployed  # noqa: E501

        :return: The build_time_stamp of this Health.
        :rtype: str
        """
        return self._build_time_stamp

    @build_time_stamp.setter
    def build_time_stamp(self, build_time_stamp: str):
        """Sets the build_time_stamp of this Health.

        Time the service was built and deployed  # noqa: E501

        :param build_time_stamp: The build_time_stamp of this Health.
        :type build_time_stamp: str
        """

        self._build_time_stamp = build_time_stamp

    @property
    def githash(self) -> str:
        """Gets the githash of this Health.

        hash of the latest Git commit of the service at time of building  # noqa: E501

        :return: The githash of this Health.
        :rtype: str
        """
        return self._githash

    @githash.setter
    def githash(self, githash: str):
        """Sets the githash of this Health.

        hash of the latest Git commit of the service at time of building  # noqa: E501

        :param githash: The githash of this Health.
        :type githash: str
        """

        self._githash = githash

    @property
    def healths(self) -> List[HealthStatus]:
        """Gets the healths of this Health.


        :return: The healths of this Health.
        :rtype: List[HealthStatus]
        """
        return self._healths

    @healths.setter
    def healths(self, healths: List[HealthStatus]):
        """Sets the healths of this Health.


        :param healths: The healths of this Health.
        :type healths: List[HealthStatus]
        """

        self._healths = healths

    @property
    def status(self) -> str:
        """Gets the status of this Health.

        Confirmation that the service is doing well  # noqa: E501

        :return: The status of this Health.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this Health.

        Confirmation that the service is doing well  # noqa: E501

        :param status: The status of this Health.
        :type status: str
        """

        self._status = status

    @property
    def time_stamp(self) -> str:
        """Gets the time_stamp of this Health.

        Current server time  # noqa: E501

        :return: The time_stamp of this Health.
        :rtype: str
        """
        return self._time_stamp

    @time_stamp.setter
    def time_stamp(self, time_stamp: str):
        """Sets the time_stamp of this Health.

        Current server time  # noqa: E501

        :param time_stamp: The time_stamp of this Health.
        :type time_stamp: str
        """

        self._time_stamp = time_stamp