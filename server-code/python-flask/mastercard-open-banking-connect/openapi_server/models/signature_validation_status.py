from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SignatureValidationStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    VALID = 'VALID'
    UNKNOWN = 'UNKNOWN'
    UNSIGNED = 'UNSIGNED'
    NONCOMPLIANT = 'NONCOMPLIANT'
    def __init__(self):  # noqa: E501
        """SignatureValidationStatus - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'SignatureValidationStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SignatureValidationStatus of this SignatureValidationStatus.  # noqa: E501
        :rtype: SignatureValidationStatus
        """
        return util.deserialize_model(dikt, cls)
