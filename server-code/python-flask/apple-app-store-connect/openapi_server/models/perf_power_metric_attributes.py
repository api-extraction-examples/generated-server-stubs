from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PerfPowerMetricAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, device_type=None, metric_type=None, platform=None):  # noqa: E501
        """PerfPowerMetricAttributes - a model defined in OpenAPI

        :param device_type: The device_type of this PerfPowerMetricAttributes.  # noqa: E501
        :type device_type: str
        :param metric_type: The metric_type of this PerfPowerMetricAttributes.  # noqa: E501
        :type metric_type: str
        :param platform: The platform of this PerfPowerMetricAttributes.  # noqa: E501
        :type platform: str
        """
        self.openapi_types = {
            'device_type': str,
            'metric_type': str,
            'platform': str
        }

        self.attribute_map = {
            'device_type': 'deviceType',
            'metric_type': 'metricType',
            'platform': 'platform'
        }

        self._device_type = device_type
        self._metric_type = metric_type
        self._platform = platform

    @classmethod
    def from_dict(cls, dikt) -> 'PerfPowerMetricAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PerfPowerMetric_attributes of this PerfPowerMetricAttributes.  # noqa: E501
        :rtype: PerfPowerMetricAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def device_type(self) -> str:
        """Gets the device_type of this PerfPowerMetricAttributes.


        :return: The device_type of this PerfPowerMetricAttributes.
        :rtype: str
        """
        return self._device_type

    @device_type.setter
    def device_type(self, device_type: str):
        """Sets the device_type of this PerfPowerMetricAttributes.


        :param device_type: The device_type of this PerfPowerMetricAttributes.
        :type device_type: str
        """

        self._device_type = device_type

    @property
    def metric_type(self) -> str:
        """Gets the metric_type of this PerfPowerMetricAttributes.


        :return: The metric_type of this PerfPowerMetricAttributes.
        :rtype: str
        """
        return self._metric_type

    @metric_type.setter
    def metric_type(self, metric_type: str):
        """Sets the metric_type of this PerfPowerMetricAttributes.


        :param metric_type: The metric_type of this PerfPowerMetricAttributes.
        :type metric_type: str
        """
        allowed_values = ["DISK", "HANG", "BATTERY", "LAUNCH", "MEMORY", "ANIMATION", "TERMINATION"]  # noqa: E501
        if metric_type not in allowed_values:
            raise ValueError(
                "Invalid value for `metric_type` ({0}), must be one of {1}"
                .format(metric_type, allowed_values)
            )

        self._metric_type = metric_type

    @property
    def platform(self) -> str:
        """Gets the platform of this PerfPowerMetricAttributes.


        :return: The platform of this PerfPowerMetricAttributes.
        :rtype: str
        """
        return self._platform

    @platform.setter
    def platform(self, platform: str):
        """Sets the platform of this PerfPowerMetricAttributes.


        :param platform: The platform of this PerfPowerMetricAttributes.
        :type platform: str
        """
        allowed_values = ["IOS"]  # noqa: E501
        if platform not in allowed_values:
            raise ValueError(
                "Invalid value for `platform` ({0}), must be one of {1}"
                .format(platform, allowed_values)
            )

        self._platform = platform
