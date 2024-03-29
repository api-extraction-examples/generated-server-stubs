from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class RestartPolicy(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, maximum_retry_count=None, name=None):  # noqa: E501
        """RestartPolicy - a model defined in OpenAPI

        :param maximum_retry_count: The maximum_retry_count of this RestartPolicy.  # noqa: E501
        :type maximum_retry_count: int
        :param name: The name of this RestartPolicy.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'maximum_retry_count': int,
            'name': str
        }

        self.attribute_map = {
            'maximum_retry_count': 'MaximumRetryCount',
            'name': 'Name'
        }

        self._maximum_retry_count = maximum_retry_count
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'RestartPolicy':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RestartPolicy of this RestartPolicy.  # noqa: E501
        :rtype: RestartPolicy
        """
        return util.deserialize_model(dikt, cls)

    @property
    def maximum_retry_count(self) -> int:
        """Gets the maximum_retry_count of this RestartPolicy.

        If `on-failure` is used, the number of times to retry before giving up  # noqa: E501

        :return: The maximum_retry_count of this RestartPolicy.
        :rtype: int
        """
        return self._maximum_retry_count

    @maximum_retry_count.setter
    def maximum_retry_count(self, maximum_retry_count: int):
        """Sets the maximum_retry_count of this RestartPolicy.

        If `on-failure` is used, the number of times to retry before giving up  # noqa: E501

        :param maximum_retry_count: The maximum_retry_count of this RestartPolicy.
        :type maximum_retry_count: int
        """

        self._maximum_retry_count = maximum_retry_count

    @property
    def name(self) -> str:
        """Gets the name of this RestartPolicy.

        - Empty string means not to restart - `always` Always restart - `unless-stopped` Restart always except when the user has manually stopped the container - `on-failure` Restart only when the container exit code is non-zero   # noqa: E501

        :return: The name of this RestartPolicy.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this RestartPolicy.

        - Empty string means not to restart - `always` Always restart - `unless-stopped` Restart always except when the user has manually stopped the container - `on-failure` Restart only when the container exit code is non-zero   # noqa: E501

        :param name: The name of this RestartPolicy.
        :type name: str
        """
        allowed_values = ["", "always", "unless-stopped", "on-failure"]  # noqa: E501
        if name not in allowed_values:
            raise ValueError(
                "Invalid value for `name` ({0}), must be one of {1}"
                .format(name, allowed_values)
            )

        self._name = name
