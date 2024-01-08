from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Video3DFormat(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    HALFSIDEBYSIDE = 'HalfSideBySide'
    FULLSIDEBYSIDE = 'FullSideBySide'
    FULLTOPANDBOTTOM = 'FullTopAndBottom'
    HALFTOPANDBOTTOM = 'HalfTopAndBottom'
    MVC = 'MVC'
    def __init__(self):  # noqa: E501
        """Video3DFormat - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'Video3DFormat':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Video3DFormat of this Video3DFormat.  # noqa: E501
        :rtype: Video3DFormat
        """
        return util.deserialize_model(dikt, cls)