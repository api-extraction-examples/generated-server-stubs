from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Outcome(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    CANCELED = 'canceled'
    INFRASTRUCTURE_FAIL = 'infrastructure_fail'
    TIMEDOUT = 'timedout'
    FAILED = 'failed'
    NO_TESTS = 'no_tests'
    SUCCESS = 'success'
    def __init__(self):  # noqa: E501
        """Outcome - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'Outcome':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Outcome of this Outcome.  # noqa: E501
        :rtype: Outcome
        """
        return util.deserialize_model(dikt, cls)
