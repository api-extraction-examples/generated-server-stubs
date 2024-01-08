import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_ok_body import PostPaymentsSepaCreditTransfersOKBody  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_params_body import PostPaymentsSepaCreditTransfersParamsBody  # noqa: E501
from openapi_server import util


def payments_sepa_credit_transfers_post(body):  # noqa: E501
    """Redeem the payment

    Redeem a SEPA credit transfer previously consented by the PSU. # noqa: E501

    :param body: Request Body
    :type body: dict | bytes

    :rtype: Union[PostPaymentsSepaCreditTransfersOKBody, Tuple[PostPaymentsSepaCreditTransfersOKBody, int], Tuple[PostPaymentsSepaCreditTransfersOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsSepaCreditTransfersParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
