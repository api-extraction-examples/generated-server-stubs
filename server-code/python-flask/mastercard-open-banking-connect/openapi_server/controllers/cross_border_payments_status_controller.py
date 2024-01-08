import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_payment_status_ok_body import PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBody  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_payment_status_params_body import PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody  # noqa: E501
from openapi_server import util


def payments_cross_border_credit_transfers_payment_status_post(body):  # noqa: E501
    """Get payment status

     # noqa: E501

    :param body: Request Body
    :type body: dict | bytes

    :rtype: Union[PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBody, Tuple[PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBody, int], Tuple[PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
