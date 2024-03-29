from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Program(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, program_type=None):  # noqa: E501
        """Program - a model defined in OpenAPI

        :param program_type: The program_type of this Program.  # noqa: E501
        :type program_type: str
        """
        self.openapi_types = {
            'program_type': str
        }

        self.attribute_map = {
            'program_type': 'programType'
        }

        self._program_type = program_type

    @classmethod
    def from_dict(cls, dikt) -> 'Program':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Program of this Program.  # noqa: E501
        :rtype: Program
        """
        return util.deserialize_model(dikt, cls)

    @property
    def program_type(self) -> str:
        """Gets the program_type of this Program.

        A seller program in to which a seller can opt-in. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ProgramTypeEnum'>eBay API documentation</a>  # noqa: E501

        :return: The program_type of this Program.
        :rtype: str
        """
        return self._program_type

    @program_type.setter
    def program_type(self, program_type: str):
        """Sets the program_type of this Program.

        A seller program in to which a seller can opt-in. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ProgramTypeEnum'>eBay API documentation</a>  # noqa: E501

        :param program_type: The program_type of this Program.
        :type program_type: str
        """

        self._program_type = program_type
