from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
import re
from openapi_server import util

import re  # noqa: E501

class PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, x_request_id=None):  # noqa: E501
        """PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo - a model defined in OpenAPI

        :param x_request_id: The x_request_id of this PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo.  # noqa: E501
        :type x_request_id: str
        """
        self.openapi_types = {
            'x_request_id': str
        }

        self.attribute_map = {
            'x_request_id': 'xRequestId'
        }

        self._x_request_id = x_request_id

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo of this PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo.  # noqa: E501
        :rtype: PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def x_request_id(self) -> str:
        """Gets the x_request_id of this PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo.

        Original xRequestId given by the client on request  # noqa: E501

        :return: The x_request_id of this PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo.
        :rtype: str
        """
        return self._x_request_id

    @x_request_id.setter
    def x_request_id(self, x_request_id: str):
        """Sets the x_request_id of this PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo.

        Original xRequestId given by the client on request  # noqa: E501

        :param x_request_id: The x_request_id of this PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo.
        :type x_request_id: str
        """
        if x_request_id is None:
            raise ValueError("Invalid value for `x_request_id`, must not be `None`")  # noqa: E501
        if x_request_id is not None and not re.search(r'^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$', x_request_id):  # noqa: E501
            raise ValueError("Invalid value for `x_request_id`, must be a follow pattern or equal to `/^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$/`")  # noqa: E501

        self._x_request_id = x_request_id
