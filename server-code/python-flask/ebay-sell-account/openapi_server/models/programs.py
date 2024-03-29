from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.program import Program
from openapi_server import util

from openapi_server.models.program import Program  # noqa: E501

class Programs(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, programs=None):  # noqa: E501
        """Programs - a model defined in OpenAPI

        :param programs: The programs of this Programs.  # noqa: E501
        :type programs: List[Program]
        """
        self.openapi_types = {
            'programs': List[Program]
        }

        self.attribute_map = {
            'programs': 'programs'
        }

        self._programs = programs

    @classmethod
    def from_dict(cls, dikt) -> 'Programs':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Programs of this Programs.  # noqa: E501
        :rtype: Programs
        """
        return util.deserialize_model(dikt, cls)

    @property
    def programs(self) -> List[Program]:
        """Gets the programs of this Programs.

        An array of seller programs that the seller's account is opted in to.  # noqa: E501

        :return: The programs of this Programs.
        :rtype: List[Program]
        """
        return self._programs

    @programs.setter
    def programs(self, programs: List[Program]):
        """Sets the programs of this Programs.

        An array of seller programs that the seller's account is opted in to.  # noqa: E501

        :param programs: The programs of this Programs.
        :type programs: List[Program]
        """

        self._programs = programs
