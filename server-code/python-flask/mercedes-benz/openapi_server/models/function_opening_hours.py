from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.function import Function
from openapi_server.models.weekdays import Weekdays
from openapi_server import util

from openapi_server.models.function import Function  # noqa: E501
from openapi_server.models.weekdays import Weekdays  # noqa: E501

class FunctionOpeningHours(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, function=None, weekdays=None):  # noqa: E501
        """FunctionOpeningHours - a model defined in OpenAPI

        :param function: The function of this FunctionOpeningHours.  # noqa: E501
        :type function: Function
        :param weekdays: The weekdays of this FunctionOpeningHours.  # noqa: E501
        :type weekdays: Weekdays
        """
        self.openapi_types = {
            'function': Function,
            'weekdays': Weekdays
        }

        self.attribute_map = {
            'function': 'function',
            'weekdays': 'weekdays'
        }

        self._function = function
        self._weekdays = weekdays

    @classmethod
    def from_dict(cls, dikt) -> 'FunctionOpeningHours':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FunctionOpeningHours of this FunctionOpeningHours.  # noqa: E501
        :rtype: FunctionOpeningHours
        """
        return util.deserialize_model(dikt, cls)

    @property
    def function(self) -> Function:
        """Gets the function of this FunctionOpeningHours.


        :return: The function of this FunctionOpeningHours.
        :rtype: Function
        """
        return self._function

    @function.setter
    def function(self, function: Function):
        """Sets the function of this FunctionOpeningHours.


        :param function: The function of this FunctionOpeningHours.
        :type function: Function
        """

        self._function = function

    @property
    def weekdays(self) -> Weekdays:
        """Gets the weekdays of this FunctionOpeningHours.


        :return: The weekdays of this FunctionOpeningHours.
        :rtype: Weekdays
        """
        return self._weekdays

    @weekdays.setter
    def weekdays(self, weekdays: Weekdays):
        """Sets the weekdays of this FunctionOpeningHours.


        :param weekdays: The weekdays of this FunctionOpeningHours.
        :type weekdays: Weekdays
        """

        self._weekdays = weekdays