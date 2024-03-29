from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GoalMetricBase(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, currency_code=None, current_display_value=None, current_number_value=None, initial_number_value=None, precision=None, progress_source=None, resource_subtype=None, target_number_value=None, unit=None):  # noqa: E501
        """GoalMetricBase - a model defined in OpenAPI

        :param gid: The gid of this GoalMetricBase.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this GoalMetricBase.  # noqa: E501
        :type resource_type: str
        :param currency_code: The currency_code of this GoalMetricBase.  # noqa: E501
        :type currency_code: str
        :param current_display_value: The current_display_value of this GoalMetricBase.  # noqa: E501
        :type current_display_value: str
        :param current_number_value: The current_number_value of this GoalMetricBase.  # noqa: E501
        :type current_number_value: float
        :param initial_number_value: The initial_number_value of this GoalMetricBase.  # noqa: E501
        :type initial_number_value: float
        :param precision: The precision of this GoalMetricBase.  # noqa: E501
        :type precision: int
        :param progress_source: The progress_source of this GoalMetricBase.  # noqa: E501
        :type progress_source: str
        :param resource_subtype: The resource_subtype of this GoalMetricBase.  # noqa: E501
        :type resource_subtype: str
        :param target_number_value: The target_number_value of this GoalMetricBase.  # noqa: E501
        :type target_number_value: float
        :param unit: The unit of this GoalMetricBase.  # noqa: E501
        :type unit: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'currency_code': str,
            'current_display_value': str,
            'current_number_value': float,
            'initial_number_value': float,
            'precision': int,
            'progress_source': str,
            'resource_subtype': str,
            'target_number_value': float,
            'unit': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'currency_code': 'currency_code',
            'current_display_value': 'current_display_value',
            'current_number_value': 'current_number_value',
            'initial_number_value': 'initial_number_value',
            'precision': 'precision',
            'progress_source': 'progress_source',
            'resource_subtype': 'resource_subtype',
            'target_number_value': 'target_number_value',
            'unit': 'unit'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._currency_code = currency_code
        self._current_display_value = current_display_value
        self._current_number_value = current_number_value
        self._initial_number_value = initial_number_value
        self._precision = precision
        self._progress_source = progress_source
        self._resource_subtype = resource_subtype
        self._target_number_value = target_number_value
        self._unit = unit

    @classmethod
    def from_dict(cls, dikt) -> 'GoalMetricBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GoalMetricBase of this GoalMetricBase.  # noqa: E501
        :rtype: GoalMetricBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this GoalMetricBase.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this GoalMetricBase.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this GoalMetricBase.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this GoalMetricBase.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this GoalMetricBase.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this GoalMetricBase.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this GoalMetricBase.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this GoalMetricBase.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def currency_code(self) -> str:
        """Gets the currency_code of this GoalMetricBase.

        ISO 4217 currency code to format this custom field. This will be null if the `unit` is not `currency`.  # noqa: E501

        :return: The currency_code of this GoalMetricBase.
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code: str):
        """Sets the currency_code of this GoalMetricBase.

        ISO 4217 currency code to format this custom field. This will be null if the `unit` is not `currency`.  # noqa: E501

        :param currency_code: The currency_code of this GoalMetricBase.
        :type currency_code: str
        """

        self._currency_code = currency_code

    @property
    def current_display_value(self) -> str:
        """Gets the current_display_value of this GoalMetricBase.

        This string is the current value of a goal metric of type string.  # noqa: E501

        :return: The current_display_value of this GoalMetricBase.
        :rtype: str
        """
        return self._current_display_value

    @current_display_value.setter
    def current_display_value(self, current_display_value: str):
        """Sets the current_display_value of this GoalMetricBase.

        This string is the current value of a goal metric of type string.  # noqa: E501

        :param current_display_value: The current_display_value of this GoalMetricBase.
        :type current_display_value: str
        """

        self._current_display_value = current_display_value

    @property
    def current_number_value(self) -> float:
        """Gets the current_number_value of this GoalMetricBase.

        This number is the current value of a goal metric of type number.  # noqa: E501

        :return: The current_number_value of this GoalMetricBase.
        :rtype: float
        """
        return self._current_number_value

    @current_number_value.setter
    def current_number_value(self, current_number_value: float):
        """Sets the current_number_value of this GoalMetricBase.

        This number is the current value of a goal metric of type number.  # noqa: E501

        :param current_number_value: The current_number_value of this GoalMetricBase.
        :type current_number_value: float
        """

        self._current_number_value = current_number_value

    @property
    def initial_number_value(self) -> float:
        """Gets the initial_number_value of this GoalMetricBase.

        This number is the start value of a goal metric of type number.  # noqa: E501

        :return: The initial_number_value of this GoalMetricBase.
        :rtype: float
        """
        return self._initial_number_value

    @initial_number_value.setter
    def initial_number_value(self, initial_number_value: float):
        """Sets the initial_number_value of this GoalMetricBase.

        This number is the start value of a goal metric of type number.  # noqa: E501

        :param initial_number_value: The initial_number_value of this GoalMetricBase.
        :type initial_number_value: float
        """

        self._initial_number_value = initial_number_value

    @property
    def precision(self) -> int:
        """Gets the precision of this GoalMetricBase.

        *Conditional*. Only relevant for goal metrics of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.  # noqa: E501

        :return: The precision of this GoalMetricBase.
        :rtype: int
        """
        return self._precision

    @precision.setter
    def precision(self, precision: int):
        """Sets the precision of this GoalMetricBase.

        *Conditional*. Only relevant for goal metrics of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.  # noqa: E501

        :param precision: The precision of this GoalMetricBase.
        :type precision: int
        """

        self._precision = precision

    @property
    def progress_source(self) -> str:
        """Gets the progress_source of this GoalMetricBase.

        This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals or projects, or managed by an integration with an external data source, such as Salesforce.  # noqa: E501

        :return: The progress_source of this GoalMetricBase.
        :rtype: str
        """
        return self._progress_source

    @progress_source.setter
    def progress_source(self, progress_source: str):
        """Sets the progress_source of this GoalMetricBase.

        This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals or projects, or managed by an integration with an external data source, such as Salesforce.  # noqa: E501

        :param progress_source: The progress_source of this GoalMetricBase.
        :type progress_source: str
        """
        allowed_values = ["manual", "subgoal_progress", "project_task_completion", "project_milestone_completion", "external"]  # noqa: E501
        if progress_source not in allowed_values:
            raise ValueError(
                "Invalid value for `progress_source` ({0}), must be one of {1}"
                .format(progress_source, allowed_values)
            )

        self._progress_source = progress_source

    @property
    def resource_subtype(self) -> str:
        """Gets the resource_subtype of this GoalMetricBase.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.  # noqa: E501

        :return: The resource_subtype of this GoalMetricBase.
        :rtype: str
        """
        return self._resource_subtype

    @resource_subtype.setter
    def resource_subtype(self, resource_subtype: str):
        """Sets the resource_subtype of this GoalMetricBase.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.  # noqa: E501

        :param resource_subtype: The resource_subtype of this GoalMetricBase.
        :type resource_subtype: str
        """
        allowed_values = ["number"]  # noqa: E501
        if resource_subtype not in allowed_values:
            raise ValueError(
                "Invalid value for `resource_subtype` ({0}), must be one of {1}"
                .format(resource_subtype, allowed_values)
            )

        self._resource_subtype = resource_subtype

    @property
    def target_number_value(self) -> float:
        """Gets the target_number_value of this GoalMetricBase.

        This number is the end value of a goal metric of type number. This number cannot equal `initial_number_value`.  # noqa: E501

        :return: The target_number_value of this GoalMetricBase.
        :rtype: float
        """
        return self._target_number_value

    @target_number_value.setter
    def target_number_value(self, target_number_value: float):
        """Sets the target_number_value of this GoalMetricBase.

        This number is the end value of a goal metric of type number. This number cannot equal `initial_number_value`.  # noqa: E501

        :param target_number_value: The target_number_value of this GoalMetricBase.
        :type target_number_value: float
        """

        self._target_number_value = target_number_value

    @property
    def unit(self) -> str:
        """Gets the unit of this GoalMetricBase.

        A supported unit of measure for the goal metric, or none.  # noqa: E501

        :return: The unit of this GoalMetricBase.
        :rtype: str
        """
        return self._unit

    @unit.setter
    def unit(self, unit: str):
        """Sets the unit of this GoalMetricBase.

        A supported unit of measure for the goal metric, or none.  # noqa: E501

        :param unit: The unit of this GoalMetricBase.
        :type unit: str
        """
        allowed_values = ["none", "currency", "percentage"]  # noqa: E501
        if unit not in allowed_values:
            raise ValueError(
                "Invalid value for `unit` ({0}), must be one of {1}"
                .format(unit, allowed_values)
            )

        self._unit = unit
